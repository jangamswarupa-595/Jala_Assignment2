package Interfaces;


interface ConstantsInterface {
    static final int MAX_VALUE = 500;
}

class ConstantsClass implements ConstantsInterface {
    public static void main(String[] args) {
        System.out.println("Max Value: " + MAX_VALUE);  // Output: Max Value: 500
    }
}

