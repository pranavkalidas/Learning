package tree;

import java.util.Arrays;

public class BST {
    public static TreeNode generateBST(String s) {
        if (s.isEmpty()) {
           // return N;
        }
        int[] nodeVals = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();

        TreeNode head = new TreeNode(nodeVals[0]);

        for (int i = 1; i < nodeVals.length; ++i) {

        }

    return head;
    }

    private static TreeNode insertIntoBST(int val, TreeNode head) {
        while (head != null) {
            if (head.val > val) {

            }
        }
        return new TreeNode();
    }

}
