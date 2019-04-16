package easy.easyLinkedList;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/10
 * @Version: 1.0
 */

public class DeleteNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
