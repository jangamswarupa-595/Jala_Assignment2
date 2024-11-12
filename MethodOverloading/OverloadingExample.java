package MethodOverloading;

public class OverloadingExample {
    void display(int a) {
        System.out.println("Single parameter method called with value: " + a);
    }
    void display(int a, int b) {
        System.out.println("Two parameter method called with values: " + a + " and " + b);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.display(10);       
        obj.display(10, 20);   
    }
}
