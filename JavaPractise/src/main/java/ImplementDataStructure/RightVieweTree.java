package ImplementDataStructure;

import java.util.*;

public class RightVieweTree {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right= new TreeNode(4);

        rightView(root);
    }

    public static void rightView(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 1; i <= size; i++) {
                TreeNode current = queue.poll();

                // Print last node of current level
                if (i == size) {
                    System.out.print(current.data + " ");
                }

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
}}
