package ThisSuper.this2;

public class ChildClass extends ParentClass {
    int childValue = 25;

    void displayValues() {
        System.out.println("Parent class value using super: " + super.parentValue);
        System.out.println("Child class value using this: " + this.childValue);
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.displayValues();  
    }
}
