package ThisSuper;

public class ConstructorExample {

    int value;

    ConstructorExample() {
        this(10); 
        System.out.println("No-argument constructor called.");
    }

    ConstructorExample(int value) {
        this.value = value;
        System.out.println("Parameterized constructor called with value: " + this.value);
    }

    public static void main(String[] args) {
        new ConstructorExample();
    }
    
}
