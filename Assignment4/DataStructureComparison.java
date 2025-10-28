import java.util.*;

public class DataStructureComparison {
    public static void main(String[] args) {
        // ---------- LinkedList ----------
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.addFirst(5);
        linkedList.addLast(30);
        System.out.println("LinkedList: " + linkedList);

        // ---------- Deque ----------
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(0);
        System.out.println("Deque front: " + deque.peekFirst() + ", back: " + deque.peekLast());

        // ---------- PriorityQueue ----------
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min-heap by default
        pq.add(5);
        pq.add(1);
        pq.add(3);
        System.out.println("PriorityQueue top (min): " + pq.peek());
        pq.poll();
        System.out.println("After poll, new top: " + pq.peek());

        // ---------- HashMap ----------
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 5);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 8);
        System.out.println("HashMap (unordered): " + hashMap);

        // ---------- TreeMap ----------
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 5);
        treeMap.put("banana", 2);
        treeMap.put("cherry", 8);
        System.out.println("TreeMap (sorted): " + treeMap);

        // ---------- HashSet ----------
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(20);
        hashSet.add(30);
        System.out.println("HashSet (unique elements): " + hashSet);
    }
}
