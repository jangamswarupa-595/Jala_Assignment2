package Exceptions;

public class NoSuchFieldExample {
    public static void main(String[] args) {
        try {
            java.lang.reflect.Field field = String.class.getField("nonexistentField");
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException caught");
        }
    }
}
