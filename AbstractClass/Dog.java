
    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks.");
        }
    
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.eat(); 
        }
    }
    