
import java.util.*;

class Customer {

    String name;
    int bills;

    Customer(String n, int b) {
        name = n;
        bills = b;
    }
}

public class CustomerWithFewerBillsFirst {

    public static void main(String[] args) {
        PriorityQueue<Customer> pq = new PriorityQueue<>(Comparator.comparingInt(c -> c.bills));

        pq.add(new Customer("Rafi", 12));
        pq.add(new Customer("Sara", 2));
        pq.add(new Customer("Imran", 7));
        pq.add(new Customer("Nabila", 1));

        while (!pq.isEmpty()) {
            Customer c = pq.poll();
            System.out.println("Serving " + c.name + " (Bills: " + c.bills + ")");
        }
    }
}
