package com;

public class Mobile1 {
    private String brand;
    private int price;

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void MobileStatus() {
        System.out.println("Mobile Status: Currently sold out!");
    }

    public Mobile1(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
}
