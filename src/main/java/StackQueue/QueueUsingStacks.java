package StackQueue;

import java.util.*;

public class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(6);
        System.out.println(queue);
    }

    public void enqueue(Integer num) {

        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(num);
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public Integer dequeue() {
        int x = s1.peek();
        s1.pop();
        return x;
    }
}
