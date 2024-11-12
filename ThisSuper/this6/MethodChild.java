package ThisSuper.this6;

public class MethodChild extends MethodParent {
    int childValue = 200;

    void showValues() {
        super.showParentValue(); 
        System.out.println("Value in Child class using this: " + this.childValue);
        System.out.println("Parent value using super in child method: " + super.parentValue);
    }

    public static void main(String[] args) {
        MethodChild obj = new MethodChild();
        obj.showValues();
    }
}
