package Interfaces;

interface InterfaceAlpha {
    void commonMethod();
}

interface InterfaceBeta {
    void commonMethod();
}
class SameMethodClass implements InterfaceAlpha, InterfaceBeta {
    public void commonMethod() {
        System.out.println("Common method from both interfaces.");
    }

    public static void main(String[] args) {
        SameMethodClass obj = new SameMethodClass();
        obj.commonMethod();  
    }
}
