package ThisSuper;

public class ArgumentConstructor {
    int x, y;

    ArgumentConstructor() {
        this(5, 10);  // Calls the constructor with arguments
        System.out.println("No-argument constructor called.");
    }

    ArgumentConstructor(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Parameterized constructor called with x: " + this.x + " and y: " + this.y);
    }

    public static void main(String[] args) {
        new ArgumentConstructor();
    }
}
