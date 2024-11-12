package Exceptions;

public class ExceptionThrowExample {
    static void throwException() throws ArithmeticException {
        throw new ArithmeticException("Exception thrown from method");
    }

    public static void main(String[] args) {
        throwException(); 
    }
}
