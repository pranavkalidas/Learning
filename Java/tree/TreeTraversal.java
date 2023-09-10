package tree;

public class TreeTraversal {

    public static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.val + " -> ");
            inorder(root.right);
        }
    }
}
