package mainpack;

import com.BankAccount;
import com.Customer;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bank Account Example ===\n");

        // Create a BankAccount object
        BankAccount account = new BankAccount("12345", "Alice", 1000.00);
        account.showAccountInfo();

        // Deposit and Withdraw with encapsulation
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000); // Invalid (shows encapsulation control)
        System.out.println("Updated Balance: $" + account.getBalance());

        System.out.println("\n=== Customer Example ===\n");

        // Create a Customer object
        Customer customer = new Customer("Bob", "bob@example.com");
        customer.displayInfo();

        // Update data using setters
        customer.setName("Bobby");
        customer.setEmail("bobby@newmail.com");
        customer.displayInfo();
    }
}
