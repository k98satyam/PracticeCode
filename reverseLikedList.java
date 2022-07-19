// https://leetcode.com/problems/reverse-linked-list/submissions/
// Definition for singly-linked list.
class ListNode {
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

public class reverseLikedList {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nxt = head.next.next;

        prev.next = null;

        while (curr.next != null) {
            curr.next = prev;
            prev = curr;
            curr = nxt;
            if (nxt == null || nxt.next == null)
                break;
            nxt = nxt.next;
        }

        curr.next = prev;
        return curr;
    }

    // recursive approach for same problem, Time complexity same for both, but
    // recursive takes more memory
    // public ListNode reverseList(ListNode head) {
    // if (head == null || head.next == null) {
    // return head;
    // }
    // ListNode nxt = head.next;
    // ListNode newHead = reverseList(nxt);
    // nxt.next = head;
    // head.next = null;
    // return newHead;
    // }
}