class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.name = "Bruno";

        dog.eat();   // Inherited from Animal
        dog.sleep(); // Inherited from Animal
        dog.bark();  // Defined in Dog
    }
}