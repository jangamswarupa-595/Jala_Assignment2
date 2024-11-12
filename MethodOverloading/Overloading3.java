package MethodOverloading;

public class Overloading3 {
    void display(int a, int b) {
        System.out.println("Method with two int parameters called, values: " + a + " and " + b);
    }

    public static void main(String[] args) {
        Overloading3 obj = new Overloading3();
        obj.display(10, 20);
    }
}
