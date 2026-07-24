try:
    from pgmpy.models import DiscreteBayesianNetwork as BayesianNetwork
except ImportError:
    from pgmpy.models import BayesianNetwork

from pgmpy.factors.discrete import TabularCPD
from pgmpy.inference import VariableElimination


def build_bayesian_network():
    model = BayesianNetwork([
        ("Rain", "Sprinkler"),
        ("Rain", "WetGrass"),
        ("Sprinkler", "WetGrass")
    ])

    print("Network Edges:", model.edges())

    cpd_rain = TabularCPD(
        variable="Rain",
        variable_card=2,
        values=[[0.8], [0.2]]
    )

    cpd_sprinkler = TabularCPD(
        variable="Sprinkler",
        variable_card=2,
        values=[
            [0.60, 0.99],
            [0.40, 0.01]
        ],
        evidence=["Rain"],
        evidence_card=[2]
    )

    cpd_wetgrass = TabularCPD(
        variable="WetGrass",
        variable_card=2,
        values=[
            [0.99, 0.20, 0.10, 0.01],
            [0.01, 0.80, 0.90, 0.99]
        ],
        evidence=["Rain", "Sprinkler"],
        evidence_card=[2, 2]
    )

    model.add_cpds(cpd_rain, cpd_sprinkler, cpd_wetgrass)

    if model.check_model():
        print("Model Validation: Passed successfully!\n")

    return model


def run_inference_queries(model):
    infer = VariableElimination(model)

    print("--- 1. Marginal Probabilities ---")
    print("P(Rain):")
    print(infer.query(["Rain"]))

    print("P(WetGrass):")
    print(infer.query(["WetGrass"]))

    print("--- 2. Conditional Inference given Evidence ---")
    print("P(Rain | WetGrass = True):")
    print(infer.query(["Rain"], evidence={"WetGrass": 1}))

    print("P(Sprinkler | WetGrass = True):")
    print(infer.query(["Sprinkler"], evidence={"WetGrass": 1}))

    print("P(WetGrass | Rain = True):")
    print(infer.query(["WetGrass"], evidence={"Rain": 1}))

    print("P(WetGrass | Sprinkler = True):")
    print(infer.query(["WetGrass"], evidence={"Sprinkler": 1}))


if __name__ == "__main__":
    bn_model = build_bayesian_network()
    run_inference_queries(bn_model)