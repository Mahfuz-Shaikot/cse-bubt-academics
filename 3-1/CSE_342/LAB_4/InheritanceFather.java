
class grandfather {

    String name;
    int age;

    grandfather(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("GrandFather: " + name + age);
    }
}

class father extends grandfather {

    father(String name, int age) {
        super(name, age);
    }

    void display() {
        System.out.println("Father :" + name + age);
    }
}

class son extends father {

    son(String name, int age) {
        super(name, age);
    }

    void display() {
        System.out.println("Son :" + name + age);
    }
}

public class InheritanceFather {

    public static void main(String[] args) {
        grandfather g;
        g = new grandfather("G ", 100);
        g.display();
        g = new father("f ", 50);
        g.display();
        g = new son("s ", 20);
        g.display();
    }
}
