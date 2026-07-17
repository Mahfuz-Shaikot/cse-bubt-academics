
import java.util.*;

class Book implements Comparable<Book> {

    int id;
    String title, author;

    Book(int i, String t, String a) {
        id = i;
        title = t;
        author = a;
    }

    public int compareTo(Book b) {
        return this.title.compareToIgnoreCase(b.title);
    }
}

public class LibraryManagementTreeSet {

    public static void main(String[] args) {
        TreeSet<Book> set = new TreeSet<>();

        set.add(new Book(1, "Data Structures", "A"));
        set.add(new Book(2, "Database System", "B"));
        set.add(new Book(3, "Java Programming", "C"));
        set.add(new Book(4, "Machine Learning", "D"));
        set.add(new Book(5, "Operating System", "E"));

        String search = "Java Programming";

        boolean found = false;
        for (Book b : set) {
            if (b.title.equalsIgnoreCase(search)) {
                System.out.println("Found: " + b.title);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}
