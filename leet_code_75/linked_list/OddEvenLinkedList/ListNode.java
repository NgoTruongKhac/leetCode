package leet_code_75.linked_list.OddEvenLinkedList;

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

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode odd = head; // con trỏ chuỗi lẻ, bắt đầu ở node 1
        ListNode even = head.next; // con trỏ chuỗi chẵn, bắt đầu ở node 2
        ListNode evenHead = even; // lưu lại đầu chuỗi chẵn để nối về sau

        // Ghép lẻ với lẻ kế tiếp, chẵn với chẵn kế tiếp
        while (even != null && even.next != null) {
            odd.next = even.next; // nối odd -> node lẻ tiếp theo
            odd = odd.next; // dời odd lên node lẻ mới

            even.next = odd.next; // nối even -> node chẵn tiếp theo
            even = even.next; // dời even lên node chẵn mới
        }

        // Nối đuôi danh sách lẻ với đầu danh sách chẵn
        odd.next = evenHead;

        return head;

    }

}
