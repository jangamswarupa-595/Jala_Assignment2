class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound(); 
    }
}
