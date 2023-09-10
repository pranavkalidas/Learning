package tree;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryTree {

    public static TreeNode generateBinaryTree(String s){

        if (s.isEmpty() || s.charAt(0) =='N') {
            return null;
        }

        String[] nodeVals = s.split(" ");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(nodeVals[0]));

        queue.add(root);
        int i = 1;
        while(!queue.isEmpty() && i<nodeVals.length){
            TreeNode currTreeNode = queue.poll();
            String currVal = nodeVals[i];

            //Set the left node of current node
            if(!nodeVals[i].equals("N")){
                currTreeNode.left = new TreeNode(Integer.parseInt(nodeVals[i]));
                queue.add(currTreeNode.left);
            }
            i++;

            if(i>=nodeVals.length){
                break;
            }

            currVal = nodeVals[i];

            if(!nodeVals[i].equals("N")){
                currTreeNode.right = new TreeNode(Integer.parseInt(nodeVals[i]));
                queue.add(currTreeNode.right);
            }
            i++;

        }

        return root;
    }

}
