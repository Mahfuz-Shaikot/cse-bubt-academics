try:
    from pgmpy.models import DiscreteBayesianNetwork as BayesianNetwork
except ImportError:
    from pgmpy.models import BayesianNetwork

from pgmpy.factors.discrete import TabularCPD
from pgmpy.inference import VariableElimination


def build_alarm_network():
    model = BayesianNetwork([
        ("Burglary", "Alarm"),
        ("Earthquake", "Alarm"),
        ("Alarm", "JohnCalls"),
        ("Alarm", "MaryCalls")
    ])

    print("Nodes:")
    print(model.nodes())
    print("\nEdges:")
    print(model.edges())

    cpd_burglary = TabularCPD(
        variable="Burglary",
        variable_card=2,
        values=[
            [0.999],
            [0.001]
        ]
    )

    cpd_earthquake = TabularCPD(
        variable="Earthquake",
        variable_card=2,
        values=[
            [0.998],
            [0.002]
        ]
    )

    cpd_alarm = TabularCPD(
        variable="Alarm",
        variable_card=2,
        values=[
            [0.999, 0.71, 0.06, 0.05],
            [0.001, 0.29, 0.94, 0.95]
        ],
        evidence=["Burglary", "Earthquake"],
        evidence_card=[2, 2]
    )

    cpd_john = TabularCPD(
        variable="JohnCalls",
        variable_card=2,
        values=[
            [0.95, 0.10],
            [0.05, 0.90]
        ],
        evidence=["Alarm"],
        evidence_card=[2]
    )

    cpd_mary = TabularCPD(
        variable="MaryCalls",
        variable_card=2,
        values=[
            [0.99, 0.30],
            [0.01, 0.70]
        ],
        evidence=["Alarm"],
        evidence_card=[2]
    )

    model.add_cpds(
        cpd_burglary,
        cpd_earthquake,
        cpd_alarm,
        cpd_john,
        cpd_mary
    )

    print("\nModel is valid:", model.check_model())
    print()

    return model


def run_inference_queries(model):
    infer = VariableElimination(model)

    result = infer.query(variables=["JohnCalls"])
    print(result)

    print(infer.query(variables=["MaryCalls"]))

    result = infer.query(
        variables=["JohnCalls"],
        evidence={
            "Alarm": 1,
            "Burglary": 0,
            "Earthquake": 0
        }
    )
    print(result)

    result = infer.query(
        variables=["MaryCalls"],
        evidence={
            "Alarm": 1,
            "Burglary": 0,
            "Earthquake": 0
        }
    )
    print(result)


if __name__ == "__main__":
    alarm_model = build_alarm_network()
    run_inference_queries(alarm_model)