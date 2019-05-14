package medium.linkedList;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/5/14
 * @Version: 1.0
 */
public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public  static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode(0);
        ListNode res = cur;
        int k = 0;
        int sum = k;

            while (l1 != null || l2 != null|| k != 0){
               sum = k ;
               if (l1 != null){
                   sum+=l1.val;
                   l1 = l1.next;
               }
               if (l2 != null){
                   sum+=l2.val;
                   l2 = l2.next;
               }
               cur.next = new ListNode(sum%10);
               cur = cur.next;
               k = sum/10;
            }
            return res.next;
    }
}
