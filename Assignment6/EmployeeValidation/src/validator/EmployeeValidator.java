package validator;

import exceptions.InvalidAgeException;
import exceptions.InvalidDeptException;
import java.util.Arrays;
import java.util.List;

public class EmployeeValidator {

    private static final List<String> validDepartments = Arrays.asList("HR", "IT", "Finance", "Marketing");

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 65) {
            throw new InvalidAgeException("Invalid Age: " + age + ". Age must be between 18 and 65.");
        }
    }

    public static void validateDept(String dept) throws InvalidDeptException {
        if (!validDepartments.contains(dept)) {
            throw new InvalidDeptException("Invalid Department: " + dept + ". Must be one of " + validDepartments);
        }
    }
}
