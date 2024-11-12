package Interfaces;

interface TwoMethodsInterface {
    void methodOne();
    void methodTwo();
}

 class PartialImplementation implements TwoMethodsInterface {
    @Override
    public void methodOne() {
        System.out.println("Only methodOne implemented.");
    }

    public static void main(String[] args) {
        PartialImplementation obj = new PartialImplementation();
        obj.methodOne();  
}

    @Override
    public void methodTwo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'methodTwo'");
    }
}