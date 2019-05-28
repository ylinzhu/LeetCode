package medium.treeAndGraphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/5/28
 * @Version: 1.0
 */
public class ZigzagLevelOrder {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>(10);
        List<Integer> temp = null;
        if (root == null) return res;
        TreeNode p = root;
        boolean flag = true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(p);
        while (p != null || !stack.empty()) {
            temp = new ArrayList<>(10);
            while (!stack.empty()) {
                TreeNode node = stack.pop();
                temp.add(node.val);

            }
            res.add(temp);


        }

        return res;
    }
}
