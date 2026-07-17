
import java.util.Stack;

class Book {

    String b_title;
    String b_auth;
    Integer b_price;

    Book(String b, String c, int d) {
        b_title = b;
        b_auth = c;
        b_price = d;
    }

    @Override
    public String toString() {
        return "\nBook Title: " + b_title + "\nBook Author: " + b_auth + "\nBook Price: " + b_price + "\n";
    }
}

public class BookStack {

    public static void main(String[] args) {
        Stack<Book> a = new Stack<>();
        a.push(new Book("ANTS", "Beru", 120));
        a.push(new Book("Drop in Sea", "Kally Rickard", 420));
        a.push(new Book("Knocking Glass", "Jason Miller", 320));
        a.push(new Book("Only I Level up Alone", "Sung jin-Woo", 520));
        System.out.println(a);
        a.pop();
        System.out.println(a);
    }
}
