package medium.treeAndGraphs;

import java.util.Stack;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/6/1
 * @Version: 1.0
 */
public class Connect {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val,Node _left,Node _right,Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if(root == null || root.left == null){
            return root;
        }
        Node node = root;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);

        while (!s1.empty() || !s2.empty()){

            while(!s1.empty()){
                Node temp = s1.pop();
                s2.push(temp);
            }


            while (!s2.empty()){
                Node temp = s2.pop();
                if (temp.left != null){
                  s1.push(temp.left);
                  s1.push(temp.right);
                }
                if (s2.size()>= 1){
                    temp.next = s2.peek();
                }
            }
        }

        return root;
    }
}
