package medium.treeAndGraphs;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/5/29
 * @Version: 1.0
 */
public class BuildTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
            TreeNode root = new TreeNode(inorder[0]);
        int[] left = new int[preorder.length];
        int[] right = new int[preorder.length];
        int indexLeft =0;
        int indexRight =0;
        boolean flag =true;

        for (int i : inorder) {
            if (i == inorder[0]) {
                flag = false;
            }
            if (i != inorder[0] && flag == true){
                left[indexLeft++] = i;
            }
            if (i != inorder[0] && flag == false){
                right[indexRight++] = i;
            }
        }

        while (indexLeft != 0 || indexRight != 0){
            if (indexLeft != 0 ){

            }
        }



    }
}
