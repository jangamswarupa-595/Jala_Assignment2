package Interfaces;

interface ExampleInterface {
    void show();
}
class ExampleClass implements ExampleInterface {
    public void show() {
        System.out.println("Method called through interface instance.");
    }

    public static void main(String[] args) {
        ExampleClass obj = new ExampleClass();
        obj.show(); 
    }
}