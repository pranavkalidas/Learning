package tree;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    static int i = 0;
    public static void main(String[] args) {
        TreeNode root = GenerateBinaryTree.generateBinaryTree("85 70 49 39 59 33 24 57 55 N N N N N N N N N N");
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        Collections.sort(list);
        binaryTreeToBST(root,list);
        TreeTraversal.inorder(root);

    }

    public static void inorder( TreeNode root, ArrayList<Integer> list ){
        if(root!=null) {
            inorder(root.left, list);
            list.add(root.val);

            inorder(root.right, list);
        }
    }

    public static void binaryTreeToBST( TreeNode root, ArrayList<Integer> list ){
        if(root!=null) {
            binaryTreeToBST(root.left, list);
            root.val = list.get(i++);
            binaryTreeToBST(root.right, list);
        }
    }



}
