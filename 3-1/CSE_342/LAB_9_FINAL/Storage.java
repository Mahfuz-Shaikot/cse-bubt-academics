
public class Storage<T> {

    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

class MainStorage {

    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>();
        stringStorage.set("Hello Java");
        String str = stringStorage.get();
        System.out.println("Stored String: " + str);

        Storage<Integer> intStorage = new Storage<>();
        intStorage.set(2026);
        Integer num = intStorage.get();
        System.out.println("Stored Integer: " + num);
    }
}
