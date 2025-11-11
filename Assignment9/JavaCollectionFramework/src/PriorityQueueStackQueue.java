// PriorityQueueStackQueue.java
// Implementing Queue and Stack using PriorityQueue with custom comparator

import java.util.*;

public class PriorityQueueStackQueue {

    // Queue Implementation
    static class MyQueue {
        private int order = 0;
        private PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        public void enqueue(int value) {
            pq.offer(new int[]{order++, value});
        }

        public int dequeue() {
            return pq.poll()[1];
        }

        public boolean isEmpty() {
            return pq.isEmpty();
        }
    }

    // Stack Implementation
    static class MyStack {
        private int order = 0;
        private PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));

        public void push(int value) {
            pq.offer(new int[]{order++, value});
        }

        public int pop() {
            return pq.poll()[1];
        }

        public boolean isEmpty() {
            return pq.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Queue dequeue: " + queue.dequeue()); // 10

        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack pop: " + stack.pop()); // 30
    }
}
