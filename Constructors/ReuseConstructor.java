package Constructors;

public class ReuseConstructor {
    int value;
    ReuseConstructor() {
        value = 10;
        System.out.println("Constructor called, value set to: " + value);
    }
    void resetValue(int newValue) {
        this.value = newValue;
        System.out.println("Value reset to: " + value);
    }

    public static void main(String[] args) {
        ReuseConstructor obj = new ReuseConstructor(); 
        obj.resetValue(20); 
    }
}
