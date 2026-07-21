package ImplementDataStructure;

import java.util.*;

public class MyLinkedList {

    private LinkNode head;


    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insert(10);
        list.insert(5);
        list.insert(11);
        list.insertEnd(20);
        list.insertEnd(30);
        list.printMiddleElement();
        list.printList();
        System.out.println();
        list.reverse();
        list.printList();

//        list.display(); // 5 -> 10 -> 20 -> 30 -> null

        list.delete(20);
//        list.display(); // 5 -> 10 -> 30 -> null

//        System.out.println(list.search(10)); // true
//        System.out.println(list.search(50)); // false
    }

    private void reverse() {
        LinkNode prev = null;
        LinkNode next = null;
        LinkNode current = head;


        while(current != null) {
            next = current.next;
            current.next = prev;
            prev= current;
            current = next;
        }
        head = prev;
    }

    public void printList() {
        LinkNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insert(int data) {
        LinkNode node = new LinkNode(data);
        node.next = head;
        head = node;
    }

    public void insertEnd(int data) {
        LinkNode node = new LinkNode(data);

        if(head == null) {
            head = node;
            return;
        }

        LinkNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
    }

    public void delete(int data) {

        if(head == null) {
            return;
        }

        if(head.data == data) {
            head = head.next;
            return;
        }

        LinkNode temp = head;
        while(temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if(temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void printMiddleElement() {
        if(head == null) {
            System.out.println("List is empty");
        }

        LinkNode fast = head;
        LinkNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Middle element is: " + slow.data);


    }

    public boolean search(int data) {
        LinkNode current = head;
        while(current != null) {
            if(current.data==data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
