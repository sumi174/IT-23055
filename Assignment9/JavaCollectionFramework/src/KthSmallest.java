// KthSmallest.java
// Program to find the kth smallest element in an ArrayList

import java.util.*;

public class KthSmallest {
    public static int findKthSmallest(ArrayList<Integer> list, int k) {
        Collections.sort(list); // Sort the ArrayList
        return list.get(k - 1); // Return kth element (index starts at 0)
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7, 2, 9, 4, 1, 6));
        int k = 3;
        System.out.println("ArrayList: " + numbers);
        System.out.println(k + "rd smallest element: " + findKthSmallest(numbers, k));
    }
}
