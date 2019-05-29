package medium.treeAndGraphs;


import java.util.ArrayList;
import java.util.LinkedList;
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
        LinkedList<TreeNode> s1 = new LinkedList<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        boolean flag = true;
        int index = 0;

        while (!s1.isEmpty() || !s2.empty()) {
            temp = new ArrayList<>(10);
            while (!s1.isEmpty()) {
                TreeNode node =  s1.pop() ;
                temp.add(node.val);
                s2.push(node);
            }
            index++;
            res.add(temp);
            while (!s2.empty()) {
                TreeNode node = s2.pop();
                if (index % 2 == 0) {
                    if (node.left != null) {
                        s1.add(node.left);
                    }
                    if (node.right != null) {
                        s1.add(node.right);
                    }
                }
                else {
                    if (node.right != null) {
                        s1.add(node.right);
                    }
                    if (node.left != null) {
                        s1.add(node.left);
                    }
                }
            }
        }
        return res;
    }

}
