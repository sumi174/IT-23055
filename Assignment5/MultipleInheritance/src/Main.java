interface Runnable {
    void run();
}

interface Jumpable {
    void jump();
}

class Athlete implements Runnable, Jumpable {
    public void run() {
        System.out.println("Athlete is running...");
    }

    public void jump() {
        System.out.println("Athlete is jumping...");
    }
}

public class Main {
    public static void main(String[] args) {
        Athlete a = new Athlete();
        a.run();
        a.jump();
    }
}
