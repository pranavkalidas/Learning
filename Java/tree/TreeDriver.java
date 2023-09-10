package tree;

public class TreeDriver {
    public static void main(String[] args) {
        TreeNode root = GenerateBinaryTree.generateBinaryTree("1 2 3 4 N");
        TreeNode node = root;
        TreeTraversal.inorder(node);
    }
}
