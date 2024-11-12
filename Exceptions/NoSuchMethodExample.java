package Exceptions;

import java.lang.reflect.Method;

public class NoSuchMethodExample {
    public static void main(String[] args) {
        try {
            Method method = String.class.getMethod("nonexistentMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException caught");
        }
    }
}
