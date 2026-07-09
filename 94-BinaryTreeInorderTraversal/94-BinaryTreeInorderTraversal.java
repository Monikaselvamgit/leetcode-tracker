// Last updated: 7/9/2026, 9:44:56 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res=new LinkedList<>();
         traverse(root,res);
         return res;
    }
    void traverse(TreeNode node, List<Integer> res){
        if(node==null) return;
        traverse(node.left, res);
        res.add(node.val);
        traverse(node.right, res);
    }
}
    