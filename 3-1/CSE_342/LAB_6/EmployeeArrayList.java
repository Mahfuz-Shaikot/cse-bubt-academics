
class emp implements Comparable<emp> {

    int e_id;
    String e_name;
    Integer e_grade;

    emp(int a, String b, int d) {
        e_id = a;
        e_name = b;
        e_grade = d;
    }

    @Override
    public String toString() {
        return "Employee Id no. " + e_id + "\nEmployee Name: " + e_name + "\nEmployee Grade: " + e_grade + "\n";
    }

    @Override
    public int compareTo(emp a) {
        return this.e_grade.compareTo(a.e_grade);
    }
}

public class EmployeeArrayList {

    public static void main(String[] args) {

    }
}
