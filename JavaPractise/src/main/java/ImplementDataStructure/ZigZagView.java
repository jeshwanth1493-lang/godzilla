package ImplementDataStructure;

import java.util.*;

public class ZigZagView {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        zigZagView(root);

    }

    public static void zigZagView(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);

        boolean leftToRight = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                level.add(current.data);

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            if (!leftToRight) {
                Collections.reverse(level);
            }

            for (int num : level) {
                System.out.print(num + " ");
            }

            leftToRight = !leftToRight;
        }
    }
}
