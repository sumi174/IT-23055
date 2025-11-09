package com;

public class Customer {
    private String name;
    private String email;

    // Constructor
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Email: " + email);
    }
}
