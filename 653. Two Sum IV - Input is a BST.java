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
    public boolean findTarget(TreeNode root, int k) {
         List<Integer> values = new ArrayList<>();
    traverseTree(root, values);
    
    
    int i=0;
    int j = values.size()-1;
    while(i<j){
        
        int sum = values.get(i)+values.get(j);
        if(sum==k){
            return true;
        }
        if(sum<k){
            i++;
        }else{
            j--;
        }
    }
    
    return false;
    
}

private void traverseTree(TreeNode node, List<Integer> values){
    
    if(node.left!=null){
        traverseTree(node.left, values);
    }
    values.add(node.val);
    if(node.right!=null){
        traverseTree(node.right, values);
    
    }
  }
}
