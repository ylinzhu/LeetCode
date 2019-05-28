package medium.linkedList;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/5/15
 * @Version: 1.0
 */
public class OddEvenList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode cur = even;

        while (cur != null && cur.next != null){
            odd.next = cur.next;
            odd = odd.next;
            cur.next = odd.next;
            cur = cur.next;
        }
        odd.next = even;


        return head;


    }
}
