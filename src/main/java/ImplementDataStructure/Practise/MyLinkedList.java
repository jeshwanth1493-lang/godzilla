package ImplementDataStructure.Practise;

public class MyLinkedList {

    private Node head;

    public void add(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        }
        else {
            node.next = head;
            head = node;
        }
    }

    public boolean search(int key) {
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void insertAtEnd(int data) {

        Node node = new Node(data);

        if(head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp=temp.next;
        }
        temp.next = node;

    }

    public void delete(int key) {

        if(head == null) {
            return;
        }

        if(head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while(temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if(temp.next != null) {
            temp.next = temp.next.next;
        }

    }

    public void printlist() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp =temp.next;
        }
    }

    public void reverse() {

        Node prev = null;
        Node next = null;
        Node current = head;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.add(5);

        list.printlist();

        list.delete(20);

        list.printlist();

        System.out.println(list.search(30));
    }
 }
