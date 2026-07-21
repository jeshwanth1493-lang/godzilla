package ImplementDataStructure;

import java.util.*;

public class LeftView {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        leftView(root);
    }

    public static void leftView(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {

            int size= queue.size();

            for(int i=1; i<=size;i++) {
                TreeNode current = queue.poll();

                if(i ==1 ){
                    System.out.print(current.data + " ");
                }

                if(current.left!=null) {
                    queue.add(current.left);
                }
                if(current.right!=null) {
                    queue.add(current.right);
                }

            }


        }

    }
}
