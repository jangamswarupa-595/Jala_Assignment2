package Constructors.Constructor2;

public class ChildClass1 {
    ChildClass1() {
        super(); 
        System.out.println("Child class default constructor called");
    }
    ChildClass1(int y) {
        super(); 
        System.out.println("Child class argument constructor called with value: " + y);
    }

    public static void main(String[] args) {
        new ChildClass1();        // Calls both default constructors
        new ChildClass1(50);      // Calls both argument constructors
    }
}
