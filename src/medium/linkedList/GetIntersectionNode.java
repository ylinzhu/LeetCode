package medium.linkedList;

import java.util.HashMap;
import java.util.Map;

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
        ListNode curA = headA;
        ListNode curB = headB;
        if (curA == null || curB == null) return null;
        Map<Integer,Integer> map = new HashMap<>();
        while (curA != null){
            if (curA.val == 0){
            }else {
                map.put(curA.val,1);
            }
            curA = curA.next;
        }
        while (curB != null){
            if (curB.val == 0 && curB.next == null){
               return null;
            }
            if (curB.val == 0){
                curB = curB.next.next;
                continue;
            }
            if (map.containsKey(curB.val))
                return curB;
            curB = curB.next;
        }
        return null;
    }
}
