package easy.easyLinkedList;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/11
 * @Version: 1.0
 */
public class MergeTwoLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**递归
     * if(l1 == null) return l2;
     * 		if(l2 == null) return l1;
     * 		if(l1.val < l2.val){
     * 			l1.next = mergeTwoLists(l1.next, l2);
     * 			return l1;
     *                } else{
     * 			l2.next = mergeTwoLists(l1, l2.next);
     * 			return l2;
     *        }
     */
    /**
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null|| l2 ==null)
            return  l1== null?l2:l1;
        ListNode root = null;

        if (l1.val<=l2.val){
            root = l1;
            l1 = l1.next;
        }else {
            root = l2;
            l2 = l2.next;
        }
        ListNode First = root;
        while (l1 != null) {
            if (l2 == null){
                root.next = l1;
                return First;
            }
            if (l1.val<=l2.val){
                root.next = l1;
                l1 = l1.next;
            }else {
                root.next = l2;
                l2 = l2.next;
            }
            root = root.next;

        }
        if (l2 != null){
            root.next = l2;
            return First;
        }
        return First;

    }
}
