package zoo;

public class Cat extends Animal implements Pet {
    void makeSound() {
        System.out.println("Meow!");
    }
    public void play() {
        System.out.println("Playing with yarn");
    }
}
