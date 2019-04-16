package easy.easyLinkedList;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/12
 * @Version: 1.0
 */
public class HasCycle {
    public  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean hasCycle(ListNode head) {
        if (head == null||head.next ==null)
            return false;
         ListNode fast = head;
         ListNode slow = head;
         //有环就一定能相遇
         while (fast!=null&& fast.next.next != null){
             fast = fast.next.next;
             slow = slow.next;
             if (fast == slow)
                 return true;
         }
        return false;
    }
}
