package leet_code_75.linked_list.DeletetheMiddleNodeofaLinkedList;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;

    }
}

class Solution {
    public static ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        int length = 0;
        ListNode curr = head;
        while (curr != null) {

            length++;
            curr = curr.next;
        }

        int middle = length / 2;

        curr = head;

        for (int i = 0; i < middle - 1; i++) {

            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode newHead = deleteMiddle(head);

        while (newHead != null) {

            System.out.println(newHead.val + " ");
            newHead = newHead.next;

        }

    }

}