
class student_info {

    int id;
    String name;

    student_info(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println("Id:" + id + " Name:" + name);
    }
}

public class Array {

    public static void main(String args[]) {
        student_info s[] = new student_info[5];

        for (int i = 0; i < s.length; i++) {
            s[i] = new student_info(12, "Rahim");
        }

        for (student_info s1 : s) {
            s1.show();
        }
    }
}
