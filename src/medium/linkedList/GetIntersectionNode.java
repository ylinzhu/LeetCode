package medium.linkedList;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/5/15
 * @Version: 1.0
 */
public class GetIntersectionNode {

    public  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }
}
