
import java.util.Stack;

class Book {

    String title, author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
}

public class BookStackMore {

    public static void main(String[] args) {
        Stack<Book> stack = new Stack<>();

        // Add 5 books
        stack.push(new Book("Java", "A", 100));
        stack.push(new Book("C++", "B", 200));
        stack.push(new Book("Python", "C", 150));
        stack.push(new Book("DBMS", "D", 180));
        stack.push(new Book("AI", "E", 300));

        // Remove top book
        stack.pop();

        // Show top book
        Book top = stack.peek();
        System.out.println(top.title + " " + top.author + " " + top.price);
    }
}
