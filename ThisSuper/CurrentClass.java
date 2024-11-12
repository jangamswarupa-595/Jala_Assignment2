package ThisSuper;

public class CurrentClass {
    int value = 42;

    void displayValue() {
        System.out.println("Value of current class using this: " + this.value);
    }

    public static void main(String[] args) {
        CurrentClass obj = new CurrentClass();
        obj.displayValue(); 
    }
    
}
