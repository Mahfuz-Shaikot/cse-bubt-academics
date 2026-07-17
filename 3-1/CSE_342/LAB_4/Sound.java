
class animal {

    void makeSound() {
        System.out.println("Animal sound!");
    }

    ;

    public void Dog() {
    }
}

class Dog extends animal {

    void makeSound() {
        System.out.println("Bark Bark");
    }
}

class Cat extends animal {

    void makeSound() {
        System.out.println("Meow Meow");
    }
}

public class Sound {

    public static void main(String[] args) {

        animal a;
        a = new Dog();
        a.makeSound();

        a = new Cat();
        a.makeSound();

    }
}
