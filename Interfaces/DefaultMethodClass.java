package Interfaces;

interface DefaultMethodInterface {
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

class DefaultMethodClass implements DefaultMethodInterface {
    public static void main(String[] args) {
        DefaultMethodClass obj = new DefaultMethodClass();
        obj.defaultMethod();  
    }
}