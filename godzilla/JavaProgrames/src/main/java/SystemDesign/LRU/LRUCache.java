package SystemDesign.LRU;

import java.util.HashMap;

public class LRUCache {
    class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private HashMap<Integer, Node> map;

    private Node head;
    private Node tail;

    public LRUCache(int capacity) {

        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    // Remove node
    //           node
    //            ↓
    //
    //head <---> 10 <---> 20 <---> 30 <---> tail
    //             ↑        ↑        ↑
    //          prev      node      next
    private void remove(Node node) {

        //10->30
        node.prev.next = node.next;
        //10<-30
        node.next.prev = node.prev;
    }

    // Insert after head
    //The insert() method performs these four actions in order:
    //
    //New node points to the current first node.
    //New node points back to head.
    //Current first node points back to the new node.
    //head points to the new node.
    //
    //A useful mnemonic is:
    //
    //New → Next, New → Prev, Next → Prev, Head → Next
    private void insert(Node node) {

        //Make it head->node->tail
        node.next = head.next;//here head.next=tail -> (node->tail)
        node.prev = head; //head -> node-> tail

        //Make it head<-node<-tail
        head.next.prev = node;// head.next=tail tail.prev=node (node<-tail)
        head.next = node;// head<-node<-tail
    }

    public int get(int key) {

        if (!map.containsKey(key))
            return -1;

        Node node = map.get(key);

        remove(node);
        insert(node);

        return node.value;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insert(node);

        } else {

            if (map.size() == capacity) {
                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }

            Node node = new Node(key, value);
            insert(node);
            map.put(key, node);
        }
    }
}

