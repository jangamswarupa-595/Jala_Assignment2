package Constructors;

public class AccessModifiersExample {
    public AccessModifiersExample() {
        System.out.println("Public constructor called");
    }

    private AccessModifiersExample(int a) {
        System.out.println("Private constructor called with value: " + a);
    }


    protected AccessModifiersExample(String str) {
        System.out.println("Protected constructor called with value: " + str);
    }

    AccessModifiersExample(double d) {
        System.out.println("Default constructor called with value: " + d);
    }

    public static void main(String[] args) {
        new AccessModifiersExample();        
        new AccessModifiersExample("Hello");  
        new AccessModifiersExample(2.5);      
        
        
}
}
