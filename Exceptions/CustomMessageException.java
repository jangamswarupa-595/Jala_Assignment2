package Exceptions;

public class CustomMessageException {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Custom error message");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
