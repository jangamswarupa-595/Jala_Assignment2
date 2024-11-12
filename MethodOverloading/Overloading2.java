package MethodOverloading;

public class Overloading2 {
    void display(int a) {
        System.out.println("Method with int parameter called, value: " + a);
    }
    void display(String text) {
        System.out.println("Method with String parameter called, text: " + text);
    }

    public static void main(String[] args) {
        Overloading2 obj = new Overloading2();
        obj.display(10);              
        obj.display("Hello World");    
    }
}
