package Interfaces;

interface PublicInterface {
    int VALUE = 100;  // public, static, and final by default

    void showValue();
}

class PublicInterfaceClass implements PublicInterface {
    public void showValue() {
        System.out.println("Value is: " + VALUE);
    }

    public static void main(String[] args) {
        PublicInterfaceClass obj = new PublicInterfaceClass();
        obj.showValue(); 
    }
}

