package medium.treeAndGraphs;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/6/3
 * @Version: 1.0
 */
public class KthSmallest {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int getLeftSize(TreeNode node){
        if (node == null)return 0;
        return 1+getLeftSize(node.left)+getLeftSize(node.right);

    }

    public static int kthSmallest(TreeNode root, int k) {
        int leftSize = getLeftSize(root.left);
        if (k<=leftSize){
            return  kthSmallest(root.left,k);
        }
        else if (k > leftSize+1){
           return kthSmallest(root.right,k-leftSize-1);
        }

        return root.val;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left= new TreeNode(1);
        root.right= new TreeNode(4);
        kthSmallest(root,1);
    }
}
