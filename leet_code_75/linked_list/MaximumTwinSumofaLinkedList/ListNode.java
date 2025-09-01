package leet_code_75.linked_list.MaximumTwinSumofaLinkedList;

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

    public static int pairSum(ListNode head) {

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // B2: Đảo ngược nửa sau linked list
        ListNode secondHalf = reverse(slow);

        // B3: So sánh và tính twin sum
        int maxSum = 0;
        ListNode firstHalf = head;
        while (secondHalf != null) {
            int sum = firstHalf.val + secondHalf.val;
            maxSum = Math.max(maxSum, sum);
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return maxSum;

    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {

    }
}