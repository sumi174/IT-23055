// LinkedListEquality.java
// Check if two LinkedLists are equal

import java.util.*;

public class LinkedListEquality {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        LinkedList<Integer> list3 = new LinkedList<>(Arrays.asList(4, 3, 2, 1));

        System.out.println("List1 equals List2? " + list1.equals(list2));
        System.out.println("List1 equals List3? " + list1.equals(list3));
    }
}
