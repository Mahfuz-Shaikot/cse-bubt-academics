
import java.util.Objects;

class Student {

    private final String studentId;
    private final String name;
    private final double cgpa;

    public Student(String studentId, String name, double cgpa) {
        this.studentId = Objects.requireNonNull(studentId, "Student ID cannot be null.").trim();
        this.name = Objects.requireNonNull(name, "Student name cannot be null.").trim();
        if (cgpa < 0.0 || cgpa > 4.0) {
            throw new IllegalArgumentException("CGPA must be between 0.0 and 4.0.");
        }
        this.cgpa = cgpa;
    }

    public String getStudentId() {
        return studentId;
    }

    public void displaySummary() {
        System.out.printf("ID: %-10s | Name: %-12s | CGPA: %.2f%n", studentId, name, cgpa);
    }
}

class CourseRegistry {

    private final Student[] roster;
    private int currentSize;

    public CourseRegistry(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        this.roster = new Student[capacity];
        this.currentSize = 0;
    }

    public void register(Student student) {
        Objects.requireNonNull(student, "Student cannot be null.");
        if (currentSize >= roster.length) {
            System.err.printf("Registration error: Capacity full for ID %s%n", student.getStudentId());
            return;
        }

        for (int i = 0; i < currentSize; i++) {
            if (roster[i].getStudentId().equalsIgnoreCase(student.getStudentId())) {
                System.err.printf("Registration error: Duplicate ID %s%n", student.getStudentId());
                return;
            }
        }

        roster[currentSize] = student;
        currentSize++;
        System.out.printf("Registered: %s%n", student.getStudentId());
    }

    public void searchById(String studentId) {
        if (studentId == null || studentId.trim().isEmpty()) {
            System.out.println("Invalid search query.");
            return;
        }

        String target = studentId.trim();
        for (int i = 0; i < currentSize; i++) {
            if (roster[i].getStudentId().equalsIgnoreCase(target)) {
                roster[i].displaySummary();
                return;
            }
        }
        System.out.printf("Student ID '%s' not found.%n", target);
    }

    public void displayRoster() {
        System.out.printf("Course Roster (%d/%d):%n", currentSize, roster.length);
        if (currentSize == 0) {
            System.out.println("  No students registered.");
        } else {
            for (int i = 0; i < currentSize; i++) {
                roster[i].displaySummary();
            }
        }
    }
}

public class StudentRegistrationSystem {

    public static void main(String[] args) {
        CourseRegistry registry = new CourseRegistry(3);

        Student s1 = new Student("221-15-101", "Mahfuz", 3.85);
        Student s2 = new Student("221-15-102", "Shaikot", 3.92);
        Student s3 = new Student("221-15-103", "Tamim", 3.61);
        Student s4 = new Student("221-15-104", "Arnob", 3.75);

        registry.register(s1);
        registry.register(s2);
        registry.register(s3);
        registry.register(s4);

        registry.displayRoster();
        registry.searchById("221-15-102");
        registry.searchById("missing-id");
    }
}
