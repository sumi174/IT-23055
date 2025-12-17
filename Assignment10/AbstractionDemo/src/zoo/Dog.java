package zoo;

public class Dog extends Animal implements Pet {
    void makeSound() {
        System.out.println("Bark!");
    }
    public void play() {
        System.out.println("Playing fetch");
    }
}
