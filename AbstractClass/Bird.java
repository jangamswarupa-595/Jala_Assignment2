class Bird extends Animal {
    @Override
    void sound() {
        System.out.println("Bird chirps.");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();  
        bird.sound();  
    }
}

