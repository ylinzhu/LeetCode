package easyLinkedList;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/10
 * @Version: 1.0
 */
public class RemoveNthFromEnd {
    public class ListNode {
        int val;
       ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n){

    ListNode root = head;
    ListNode pre = head;
    ListNode temp = head;
        for (int i = 0; i < n; i++) {
        temp = temp.next;
        if (temp == null)
            return root.next;
    }
        while (temp.next != null){

        head = head.next;
        temp = temp.next;
    }

    head.next = head.next.next;

            return root;




    }
}
