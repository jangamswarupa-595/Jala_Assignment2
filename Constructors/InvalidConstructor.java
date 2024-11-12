package Constructors;

public class InvalidConstructor {
    int InvalidConstructor() {
        System.out.println("This is not a constructor, but a method returning int");
        return 0;
    }

    String InvalidConstructor(String str) {
        System.out.println("This is not a constructor, but a method returning String");
        return str;
    }
    
    public static void main(String[] args) {
        
    }
}
