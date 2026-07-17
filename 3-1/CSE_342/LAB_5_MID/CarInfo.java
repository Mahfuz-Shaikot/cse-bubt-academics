class Car {
    private String brand;
    private String model;
    private int year;
    private double mileage;

    public Car(String brand, String model, int year, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public void showDetails() {
        System.out.printf("Brand: %s | Model: %s | Year: %d | Mileage: %.2f%n", brand, model, year, mileage);
    }

    public void showDetails(boolean showBrandModelOnly) {
        if (showBrandModelOnly) {
            System.out.printf("Brand: %s | Model: %s%n", brand, model);
        }
    }

    public void showDetails(String type) {
        if ("mileage".equalsIgnoreCase(type)) {
            System.out.printf("Mileage: %.2f%n", mileage);
        }
    }
}

public class CarInfo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 15000.50);

        car.showDetails(true);
        car.showDetails("mileage");
        car.showDetails();
    }
}