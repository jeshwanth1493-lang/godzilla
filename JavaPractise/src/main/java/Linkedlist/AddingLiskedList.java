package Linkedlist;

public class AddingLiskedList {

    // Node class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Function to add two linked lists
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }

    // Print Linked List
    public static void printList(ListNode head) {

        while (head != null) {

            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // First number : 342
        // Stored as 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Second number : 465
        // Stored as 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.print("List 1 : ");
        printList(l1);

        System.out.print("List 2 : ");
        printList(l2);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.print("Result : ");
        printList(result);
    }
}
