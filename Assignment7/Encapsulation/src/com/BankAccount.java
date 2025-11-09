package com;

/**
 * Demonstrates Encapsulation in Java using a BankAccount example.
 * Sensitive data like account number and balance are hidden
 * and can be accessed or modified only through public methods.
 */
public class BankAccount {
    // Private data fields - encapsulated (hidden from outside)
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize account
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter for account number (read-only)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter and Setter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for balance (read-only)
    public double getBalance() {
        return balance;
    }

    // Method to deposit money safely
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Method to withdraw money safely
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }

    // Method to display account summary
    public void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
