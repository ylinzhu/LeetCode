package easyTrees;

import java.util.*;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/4/15
 * @Version: 1.0
 */
public class LevelOrder {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /*public void levelOrder(TreeNode root, List list, List coreList) {

        if (root.left != null) {
            coreList.add(root.left.val);
        }
        if (root.right != null) {
            coreList.add(root.right.val);
        }
        if (coreList.size() == 0)
            return;
        if (root.)
            levelOrder(root.left, list, coreList);
        levelOrder(root.right, list, coreList);
        list.add(coreList);
        coreList.clear();


    }*/

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        List<Integer> coreList = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int comeCount = 1;
        int outCount = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.pollFirst();
            outCount++;
            coreList.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
            if (comeCount == outCount) {
                list.add(coreList);
                coreList = new ArrayList<>();
                outCount = 0;
                comeCount = queue.size();
            }

        }
            return list;


    }
}
