import validator.EmployeeValidator;
import exceptions.InvalidAgeException;
import exceptions.InvalidDeptException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Enter department: ");
            String dept = scanner.nextLine();

            EmployeeValidator.validateAge(age);
            EmployeeValidator.validateDept(dept);

            System.out.println("Employee age " + age + " and department " + dept + " are valid.");

        } catch (InvalidAgeException e) {
            System.out.println("Age Error: " + e.getMessage());
        } catch (InvalidDeptException e) {
            System.out.println("Department Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Age must be an integer.");
        } finally {
            scanner.close();
        }
    }
}
