package MethodOverloading;

public class Overloading4 {
    void display(int a, double b) {
        System.out.println("Method with int and double parameters called, values: " + a + " and " + b);
    }
    void display(double a, int b) {
        System.out.println("Method with double and int parameters called, values: " + a + " and " + b);
    }

    public static void main(String[] args) {
        Overloading4 obj = new Overloading4();
        obj.display(10, 20.5);    
        obj.display(15.5, 10);  
}
}