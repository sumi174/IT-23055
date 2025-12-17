package zoo;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sleep();
        dog.makeSound();
        dog.play();

        cat.sleep();
        cat.makeSound();
        cat.play();
    }
}
