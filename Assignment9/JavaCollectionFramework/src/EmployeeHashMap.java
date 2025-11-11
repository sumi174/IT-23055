// EmployeeHashMap.java
// Program to map employee IDs to their departments using HashMap

import java.util.*;

public class EmployeeHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeDept = new HashMap<>();

        employeeDept.put(1001, "HR");
        employeeDept.put(1002, "IT");
        employeeDept.put(1003, "Finance");
        employeeDept.put(1004, "Marketing");

        System.out.println("Employee Department Mappings:");
        for (Map.Entry<Integer, String> entry : employeeDept.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + " -> Department: " + entry.getValue());
        }
    }
}
