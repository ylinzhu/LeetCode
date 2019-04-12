package easyTrees;

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
        TreeNode(int x) { val = x; }
    }

    public static boolean isLeft(TreeNode root,int k){
        if(root.left == null&&root.right == null)
            return true;
        if (root.left.val>=k||root.right.val>=k)
            return false;
        if (root.left == null)
            return root.val>=root.right.val||(root.right.val<=k)?false:isLeft(root.right,k);
        else if (root.right == null)
            return root.val<=root.left.val?false:isLeft(root.left,k);

        if (root.val<=root.left.val|| root.val>=root.right.val){
            return false;
        }
        return isLeft(root.left,k)&&isLeft(root.right,k);

    }

   /* public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        return isLeft(root.left,k)&&(root.right,k);


    }*/
}
