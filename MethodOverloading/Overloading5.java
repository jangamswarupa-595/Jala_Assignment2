package MethodOverloading;

public class Overloading5 {
    int getValue() {
        return 10;
    }
    public static void main(String[] args) {
        Overloading5 obj = new Overloading5();
        int result = obj.getValue(); 
        System.out.println("Result: " + result);
    }
}
