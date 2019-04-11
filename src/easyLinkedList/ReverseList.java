package easyLinkedList;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/11
 * @Version: 1.0
 */
public class ReverseList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode first = new ListNode(head.val);
        current = current.next;
        while (current != null){
            ListNode newNode = new ListNode(current.val);
            newNode.next = first;
            first = newNode;
            current = current.next;
        }
        return first;
    }
}
