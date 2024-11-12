package Interfaces;

interface InterfaceOne {
    void methodA();
}

interface InterfaceTwo {
    void methodB();
}

class MultipleInterfacesClass implements InterfaceOne, InterfaceTwo {
    public void methodA() {
        System.out.println("Method A from InterfaceOne");
    }

    public void methodB() {
        System.out.println("Method B from InterfaceTwo");
    }

    public static void main(String[] args) {
        MultipleInterfacesClass obj = new MultipleInterfacesClass();
        obj.methodA();  
        obj.methodB(); 
    }
}