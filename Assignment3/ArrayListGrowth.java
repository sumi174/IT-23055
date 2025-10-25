import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListGrowth {
    public static void main(String[] args) throws Exception {
        // Create an ArrayList with initial capacity 10
        ArrayList<String> list = new ArrayList<>(10);

        // Add 10 elements to fill the initial capacity
        for (int i = 1; i <= 10; i++) {
            list.add("IT2300" + i);
        }

        // Print current size and internal capacity before exceeding
        System.out.println("Before exceeding capacity:");
        System.out.println("Size: " + list.size());
        System.out.println("Internal Capacity: " + getCapacity(list));

        // Add one more element to exceed the initial capacity
        list.add("IT23011");

        // Print size and capacity after exceeding
        System.out.println("\nAfter exceeding initial capacity:");
        System.out.println("Size: " + list.size());
        System.out.println("Internal Capacity: " + getCapacity(list));
    }

    // Helper method to access the private 'elementData' array using reflection
    private static int getCapacity(ArrayList<?> list) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        Object[] data = (Object[]) dataField.get(list);
        return data.length;
    }
}
