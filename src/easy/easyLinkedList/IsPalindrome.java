package easy.easyLinkedList;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/11
 * @Version: 1.0
 */
public class IsPalindrome {

    public  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 使用链表反转在比较,直接想出的办法,复杂度为0(n),最简单的改进就是反转后半段即可
     * @param head
     * @return
     */
    public  boolean isPalindrome(ListNode head) {
        if (head == null)
            return true;

        ListNode fast = head;
        ListNode current = head;
        while (fast!=null){
            if (fast.next == null)
                break;
            fast = fast.next.next;
            current = current.next;
        }

        ListNode first = new ListNode(current.val);
        current = current.next;

        while (current != null){
            ListNode newNode = new ListNode(current.val);
            newNode.next = first;
            first = newNode;
            current = current.next;
        }
        while (first != null){
            if (head.val != first.val)
                return  false;
            head = head.next;
            first = first.next;
        }
        return true;
    }

    public boolean isPalindromes(ListNode head) {
        if (head == null)
            return true;
      return true;
    }


}
