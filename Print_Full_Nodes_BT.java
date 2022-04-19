import java.util.*;
class Node {
    int data;
    Node left, right;
    Node(int data) {
        left=right=null;
        this.data=data;
    }
};

public class Main
{
    public static void findFullNode(Node root) {
        if(root != null) {
            findFullNode(root.left);
            if (root.left != null && root.right != null) {
                System.out.print(root.data+" ");
            }
            findFullNode(root.right);
        }
        
    }
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		findFullNode(root);
	}
}
