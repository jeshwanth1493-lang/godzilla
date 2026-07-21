package ImplementDataStructure.Practise;

public class MyHashMap<K,V> {

    MapNode<K,V> [] bucket = null;
    int capacity =16;
    int size=0;

    public MyHashMap() {
        bucket = new MapNode[capacity];
    }

    public int bucketIndex(K key) {
        int i = key.hashCode();
        return Math.abs(i%capacity);
    }

    public void put(K key , V value) {
        int index = bucketIndex(key);
        MapNode<K,V> head = bucket[index];
        MapNode<K,V> newNode = new MapNode<>(key,value);
        if(head ==null) {
            head = newNode;
            return;
        }

        while(head!= null) {
            if(head.key == key) {
                head.value=value;
                return;
            }
            head = head.next;
        }

        newNode.next = bucket[index];
        bucket[index] = newNode;
        size++;

    }

    public V get(K key) {
        int index = bucketIndex(key);
        MapNode<K,V> head = bucket[index];

        if(head != null && head.key == key) {
            return head.value;
        }

        while(head !=null) {
            if(head.key.equals(key)) {
                return head.value;
            }
            head =head.next;
        }

        return null;
    }

    public void remove(K key) {
        int index = bucketIndex(key);
        MapNode<K,V> head = bucket[index];
        MapNode<K,V> prev =null;

        while(head != null && head.next != null) {
            if(head.key.equals(key)) {
                head.next = head.next.next;
                return;
            }
            head = head.next;
        }
    }
}
