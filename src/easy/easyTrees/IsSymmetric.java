package easy.easyTrees;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/15
 * @Version: 1.0
 */
public class IsSymmetric {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null && right != null &&left != null && right == null)
            return false;
        if (left != right){
            return false;
        }
          return   isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
    }


    public boolean isSymmetric(TreeNode root) {
        if (root == null||(root.left ==null &&root.right == null))
            return true;
        return isSymmetric(root.left, root.right) ;

    }
}
