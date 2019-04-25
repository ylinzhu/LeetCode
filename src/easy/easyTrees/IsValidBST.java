package easy.easyTrees;

import java.util.Stack;
import java.util.WeakHashMap;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/12
 * @Version: 1.0
 */
public class IsValidBST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static boolean isValidBST(TreeNode root, double low ,double hi) {
           if (root == null)
               return true;
           if (root.val <= low||root.val >= hi)
               return false;
        return    isValidBST(root.left,low,root.val)&&isValidBST(root.right,root.val,hi);

    }

    public static boolean isValidBSTTwo(TreeNode root) {
        if (root == null||(root.left == null && root.right == null))
            return true;
        return isValidBST(root ,Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY);

    }

        //栈的思想
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pre !=null&& root.val<=pre.val)
                return false;
            pre =root;
            root = root.right;
        }
        return true;

    }
}
