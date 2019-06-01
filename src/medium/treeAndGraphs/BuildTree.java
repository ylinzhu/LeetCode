package medium.treeAndGraphs;

/**
 * @Designation:需要改进
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



    // TODO 确定二叉树需要改进
    public  TreeNode construcBinaTree(int [] pre ,int preStart,int preEnd,int [] ino,int inoStart,int inoEnd){
        if (preStart >preEnd || inoStart>inoEnd) return null;
        //找到根节点
        TreeNode root = new TreeNode(pre[preStart]);

        for (int i = inoStart; i <= inoEnd; i++) {
            if (root.val == ino[i]){
                //左子树构建
                root.left = construcBinaTree(pre,preStart+1,i-inoStart+preStart,ino,inoStart,i-1);
                //右子树构建
                root.right = construcBinaTree(pre,i-inoStart+preStart+1,preEnd,ino,i+1,inoEnd);
                break;
            }
        }
        return root;

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
            TreeNode root = construcBinaTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        return root;





    }
}
