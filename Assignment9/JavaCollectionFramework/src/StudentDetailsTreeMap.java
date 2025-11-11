// StudentDetailsTreeMap.java
// Using TreeMap to store student IDs mapped to their details

import java.util.*;

class Student {
    String name;
    int age;
    String course;

    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Course: " + course;
    }
}

public class StudentDetailsTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, Student> students = new TreeMap<>();

        students.put(101, new Student("Alice", 20, "B.Tech"));
        students.put(103, new Student("Bob", 22, "B.Sc"));
        students.put(102, new Student("Charlie", 21, "BCA"));

        System.out.println("Student Details (Sorted by ID):");
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
