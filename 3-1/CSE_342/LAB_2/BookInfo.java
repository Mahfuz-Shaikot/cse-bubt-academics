
import java.time.Year;
import java.util.Objects;

class Book {

    private final String title;
    private final String author;
    private final int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = validateNonEmpty(title, "Book title");
        this.author = validateNonEmpty(author, "Author name");

        int currentYear = Year.now().getValue();
        if (yearPublished < 0 || yearPublished > currentYear) {
            throw new IllegalArgumentException("Invalid publication year: " + yearPublished);
        }
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void displayInfo() {
        System.out.printf("Title: %s | Author: %s | Year: %d%n", title, author, yearPublished);
    }

    private static String validateNonEmpty(String value, String fieldName) {
        Objects.requireNonNull(value, fieldName + " cannot be null.");
        if (value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be empty.");
        }
        return value.trim();
    }
}

public class BookInfo {

    public static void main(String[] args) {
        Book book1 = new Book("Introduction to Algorithms", "Thomas H. Cormen", 2009);
        Book book2 = new Book("Compilers: Principles, Techniques, and Tools", "Alfred Aho", 2006);

        book1.displayInfo();
        book2.displayInfo();
    }
}
