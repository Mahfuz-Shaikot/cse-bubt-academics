
import java.util.Scanner;

class Complex {

    int real;
    int imag;

    public Complex() {
        real = 0;
        imag = 0;
    }

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real and imaginary numbers respectively: ");
        real = sc.nextInt();
        imag = sc.nextInt();
    }

    public Complex add(Complex c) {
        Complex temp = new Complex();
        temp.real = this.real + c.real;
        temp.imag = this.imag + c.imag;
        return temp;
    }

    public void display() {
        System.out.println("Sum = " + real + " + " + imag + "i");
    }

    public static void main(String args[]) {
        Complex ob1 = new Complex();
        Complex ob2 = new Complex();

        ob1.read();
        ob2.read();

        Complex result = ob1.add(ob2);
        result.display();
    }
}
