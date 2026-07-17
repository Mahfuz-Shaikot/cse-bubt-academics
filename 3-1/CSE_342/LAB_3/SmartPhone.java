
public class SmartPhone {

    private String brand;
    private String model;
    private int storageCapacity;

    public SmartPhone(String brand, String model, int storageCapacity, int inStorage) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void inStorage(int inValue) {
        storageCapacity += inValue;
    }

    public static void main(String args[]) {
        SmartPhone ob1 = new SmartPhone("Samsung", "A30", 64, 128);

        System.out.println("Brand: " + ob1.getBrand() + "Model: " + ob1.getModel() + "Capacity: " + ob1.getStorageCapacity() + "GB");

    }

}
