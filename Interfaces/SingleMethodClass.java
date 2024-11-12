package Interfaces;

interface SingleMethodInterface {
    void display();
}
class SingleMethodClass implements SingleMethodInterface{
    public void display() {
        System.out.println("Single method implemented.");
    }

    public static void main(String[] args) {
        SingleMethodClass obj = new SingleMethodClass();
        obj.display(); 
    }
    
}
