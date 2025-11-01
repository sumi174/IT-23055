class Vehicle {
    protected String brand = "Toyota";

    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println(brand + " says: Beep Beep!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.showBrand();
        c.honk();
    }
}
