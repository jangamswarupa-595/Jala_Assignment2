package Constructors;

public class MyClass {
    MyClass() {
        System.out.println("Default constructor called");
    }

    MyClass(int a) {
        System.out.println("One-argument constructor called with value: " + a);
    }

    MyClass(int a, int b) {
        System.out.println("Two-argument constructor called with values: " + a + ", " + b);
    }

    public static void main(String[] args) {
        
        new MyClass();            
        new MyClass(10);           
        new MyClass(20, 30);      
    }
}
