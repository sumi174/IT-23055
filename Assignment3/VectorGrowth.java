import java.lang.reflect.Field;
import java.util.Vector;

public class VectorGrowth {
    public static void main(String[] args) throws Exception {
        // Create a Vector with initial capacity 10
        Vector<String> vector = new Vector<>(10);

        // Add 10 elements to fill the initial capacity
        for (int i = 1; i <= 10; i++) {
            vector.add("IT2300" + i);
        }

        // Print size and capacity before exceeding
        System.out.println("Before exceeding capacity:");
        System.out.println("Size: " + vector.size());
        System.out.println("Internal Capacity: " + vector.capacity());

        // Add one more element to exceed capacity
        vector.add("IT23011");

        // Print size and capacity after exceeding
        System.out.println("\nAfter exceeding initial capacity:");
        System.out.println("Size: " + vector.size());
        System.out.println("Internal Capacity: " + vector.capacity());
    }
}
