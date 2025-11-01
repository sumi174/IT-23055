abstract class Shape {
    abstract void area();

    void info() {
        System.out.println("Calculating area of a shape...");
    }
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.info();
        c.area();
    }
}
