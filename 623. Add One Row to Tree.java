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
    
    int target = 0;
    int val = 0;
    
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        this.target = depth;
        this.val = val;
        
        return transform(root, 1, 'L');
    }
    
    TreeNode transform(TreeNode node, int depth, char dir) {        
        if (node == null && depth != target) return node;
        
        if (depth == target) {
            TreeNode newNode = new TreeNode(val);
            
            if (dir == 'L') 
                newNode.left = node;
            else
                newNode.right = node;
            
            return newNode;
        }
        
        node.left = transform(node.left, depth+1, 'L');
        node.right = transform(node.right, depth+1, 'R');
        
        return node;
    }
}

