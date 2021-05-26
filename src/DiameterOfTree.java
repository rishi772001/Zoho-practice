package com.rishi;

public class DiameterOfTree {
    public static int height(TreeNode root)
    {
        if(root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
    public static int findDiameter(TreeNode root)
    {
        if(root == null)
            return 0;

        int lheight = height(root.left);
        int rheight = height(root.right);

        int ldia = findDiameter(root.left);
        int rdia = findDiameter(root.right);

        return Math.max(lheight + rheight + 1, Math.max(ldia, rdia));
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        /*
            constructed tree
                     1
                  /   \
                2      3
              /  \
            4     5
                    \
                     6
                      \
                       7
         */
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.left.right.right.right = new TreeNode(7);
        System.out.println(findDiameter(root));
    }
}
