import java.util.*;

class BinarySearchTree {
    //Represents a node of binary tree
    public static class Node {
        int data;
        Node left;
        Node right;
        
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    
    //Representing the root of binary tree
    public Node root;
    
    public BinarySearchTree() {
        root = null;
    }
    
    //insert() will add new node to the binary search tree
    public void insert(int data) {
        Node newNode = new Node(data);
        
        //check wheather tree is empty
        if(root == null) {
            root = newNode;
            return;
        }
        else {
            //current node point to root of the tree
            Node current = root, parent = null;
            
            while(true) {
                parent = current;
                
                //if data is less than currents data, node will be inserted to the left long
                if(data < current.data) {
                    current = current.left;
                    if(current == null) {
                        parent.left = newNode;
                        return;
                    } 
                }
                
                //if data is greater than current's data, node wil be inserted to the right
                else {
                    current = current.right;
                    if(current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    //minnode
    public Node minNode(Node root) {
        if(root.left != null) {
            return minNode(root.left);
        }
        else {
            return root;
        }
    }
    
    //deleteNode() will delete the given node form the binary tree
    
    
    //inorder() will perform inorder traversal on binary search tree
    public void inorderTraversal(Node node) {
        //Check wheather tree is empty
        if(root == null) {
            System.out.println("Tree is Empty");
            return;
        }
        else {
            
            if(node.left != null) 
                inorderTraversal(node.left);
            System.out.println(node.data + " ");
            if(node.right != null) 
                inorderTraversal(node.right);
            
        }
    }
    
}

public class Main
{
	public static void main(String[] args) {
	    BinarySearchTree bt = new BinarySearchTree();
	    
	    //Add Nodes to the binary Tree
	    bt.insert(50);
	    bt.insert(30);
	    bt.insert(70);
	    bt.insert(60);
	    bt.insert(10);
	    bt.insert(90);
	    
	    System.out.println("Binary Search Tree after insertion:");
	    
	    //Display the binary Tree
	    bt.inorderTraversal(bt.root);
	}
}
