package ImplementDataStructure;

import static java.lang.Math.abs;

public class MyHashMap<K,V>{

    static class Node<K,V> {
        K key;
        V value;
        Node<K,V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    Node<K,V>[] bucket ;
    int capacity =16;
    int size =0;

    public MyHashMap() {
        bucket = new Node[capacity];
    }

    //hashFunction
    public int bucketIndex(K key) {
        int i = key.hashCode();
        return Math.abs(i) % capacity;
    }

    public void put(K key, V value) {

        int index = bucketIndex(key);
        Node<K,V>  head = bucket[index];

        while(head != null) {
            if(head.key.equals(key)) {
                head.value = value;
                return ;
            }
            head = head.next;
        }

        Node<K,V> newNode =  new Node(key,value);
        newNode.next=bucket[index];
        bucket[index] = newNode;
        size++;
    }

    public V get(K key) {

        int index = bucketIndex(key);
        Node<K,V>  head = bucket[index];

        while(head != null) {
            if(head.key.equals(key)) {
                return head.value;
            }
            head= head.next;
        }
        return null;
    }

    public void remove(K key) {

        int index = bucketIndex(key);
        Node<K,V>  head = bucket[index];
        Node<K,V>  prev=null;

        while(head != null) {
            if(head.key.equals(key)) {
                if(prev == null) {
                    bucket[index]=head.next;
                }
                else{
                    prev.next=head.next;
                }

                size--;
                return;

            }
            prev=head;
            head=head.next;
        }

    }

    public int size() {
        return size;
    }
}
