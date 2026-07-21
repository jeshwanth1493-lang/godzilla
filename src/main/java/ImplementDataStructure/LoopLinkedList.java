package ImplementDataStructure;

public class LoopLinkedList {

    public static void main(String[] args) {
        LinkNode head = new LinkNode(1);
        head.next = new LinkNode(2);
        head.next.next = new LinkNode(3);
        head.next.next.next = new LinkNode(4);



        head.next.next.next.next = head.next;

        System.out.println(hasLoop(head)); // true
    }

    public static boolean hasLoop(LinkNode head) {

        LinkNode slow = head;
        LinkNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}
