package Exceptions;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is a custom exception");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
