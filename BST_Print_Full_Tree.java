//Printing full binary tree using top down approach
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
    public static void printFullBT(Node root) {
        //Top Down Apporach
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        //create two EMpty Queues and enqueue root's left and right child respectively
        
        Queue<Node> first = new ArrayDeque<>();
        Queue<Node> second = new ArrayDeque<>();
        
        if(root.left != null && root.right != null) {
            first.add(root.left);
            second.add(root.right);
        }
        
        //loop till queue is EMpty
        while (!first.isEmpty()) {
            int n = first.size();
            
            while(n-- > 0) {
                //Dequeu front node from the first queue and print it
                Node x = first.poll();
                
                System.out.print(x.data + " ");
                if (x.left != null) {
                    first.add(x.left);
                }
                
                if (x.right != null) {
                    first.add(x.right);
                }
                
                Node y = second.poll();
                
                System.out.print(y.data + " ");
                
                if(y.right != null) {
                    second.add(y.right);
                }
                if(y.left != null) {
                    second.add(y.left);
                }
                
                
            }
        }
    }
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		printFullBT(root);
	}
}
