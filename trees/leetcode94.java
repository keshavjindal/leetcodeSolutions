import java.util.*;

public class leetcode94 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
  }

    public List<Integer> inorderTraversal(TreeNode root) 
    {
        list = new ArrayList<>();
        
        solve(root);
        
        return list;
    }
    
    public List<Integer> list;

    public void solve(TreeNode node){
        
        if(node == null) return;
        
        solve(node.left);
        list.add(node.val);
        solve(node.right);
    }
}