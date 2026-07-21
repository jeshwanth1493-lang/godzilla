package Linkedlist;

public class RotateLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        // Find length and last node
        ListNode tail = head;
        int length = 1;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Reduce unnecessary rotations
        k = k % length;

        if (k == 0)
            return head;

        // Make circular
        tail.next = head;

        // Find new tail
        int steps = length - k - 1;

        ListNode newTail = head;

        while (steps-- > 0) {
            newTail = newTail.next;
        }

        // New head
        ListNode newHead = newTail.next;

        // Break circle
        newTail.next = null;

        return newHead;
    }

    public static void print(ListNode head) {

        while (head != null) {

            System.out.print(head.val);

            if (head.next != null)
                System.out.print(" -> ");

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List : ");
        print(head);

        head = rotateRight(head, 2);

        System.out.print("Rotated List  : ");
        print(head);
    }
}
