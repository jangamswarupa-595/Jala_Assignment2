package ThisSuper.this5;

public class SuperChild extends SuperParent {
    SuperChild() {
        super(); 
        System.out.println("Child class constructor called.");
    }

    public static void main(String[] args) {
        new SuperChild();
       
    }
}
