package StackQueue;

import java.util.*;

public class MinMaxStack {

    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public MinMaxStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {

        mainStack.push(value);

        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public void pop() {
        if (mainStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }

        mainStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main (String[] args) {

        MinMaxStack stack = new MinMaxStack();

        stack.push(1);
        System.out.println(stack.getMin());
        stack.pop();
        stack.push(6);
        stack.push(10);
        stack.push(3);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());

////        System.out.println(stack.getMax);
    }


}
