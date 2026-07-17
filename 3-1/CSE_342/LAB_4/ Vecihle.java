
abstract class Vehicle {

    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public abstract double calculateFuelEfficiency();

    public abstract double calculateDistanceTraveled(double hours);

    public abstract double getMaxSpeed();
}

class Truck extends Vehicle {

    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 8.5;
    }

    @Override
    public double calculateDistanceTraveled(double hours) {
        return getMaxSpeed() * hours * 0.85;
    }

    @Override
    public double getMaxSpeed() {
        return 120.0;
    }
}

class Car extends Vehicle {

    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 15.0;
    }

    @Override
    public double calculateDistanceTraveled(double hours) {
        return getMaxSpeed() * hours * 0.90;
    }

    @Override
    public double getMaxSpeed() {
        return 200.0;
    }
}

class Motorcycle extends Vehicle {

    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 25.0;
    }

    @Override
    public double calculateDistanceTraveled(double hours) {
        return getMaxSpeed() * hours * 0.95;
    }

    @Override
    public double getMaxSpeed() {
        return 180.0;
    }
}
