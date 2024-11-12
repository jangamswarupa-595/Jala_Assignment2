package Interfaces;

interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}


class InterfaceInheritanceClass implements ChildInterface {
    public void parentMethod() {
        System.out.println("Parent method implemented.");
    }

    public void childMethod() {
        System.out.println("Child method implemented.");
    }

    public static void main(String[] args) {
        InterfaceInheritanceClass obj = new InterfaceInheritanceClass();
        obj.parentMethod();  
        obj.childMethod();  
    }
}

