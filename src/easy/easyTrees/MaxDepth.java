package easy.easyTrees;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/12
 * @Version: 1.0
 */
public class MaxDepth {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public int maxDepth(TreeNode root) {
        return root == null?0:1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
