import java.util.*;

//Binary Tree Representation

class Node
{
	int key;
	Node left;
	Node right;

	public Node(int item){
		key = item;
		left = null;
		right = null;
	}
}

class Binary_Tree 
{
	Node root;

	Binary_Tree(int key){
		root = new Node(key);
	}

	Binary_Tree(){
		root = null;
	}
	
	//Traverse Inorder
	public void traverseInorder(Node node){
		if(node != null){
			traverseInorder(node.left);
			System.out.println(" "+node.key);
			traverseInorder(node.right);
		}
	}

	//Traverse PreOrder
	public void traversePreorder(Node node){
		if(node != null){
			System.out.println(" "+node.key);
			traversePreorder(node.left);
			traversePreorder(node.right);
		}
	}

	//Traverse Postorder
	public void traversePoster(Node node){
		if(node != null){
			traversePoster(node.left);
			traversePoster(node.right);
			System.out.println(" "+node.key);
		}
	}
	public static void main(String[] args) 
	{
		Binary_Tree tree = new Binary_Tree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);

		System.out.println("Pre Order Traversel: ");
		tree.traversePreorder(tree.root);
		System.out.println("\nIn Order Traversal: ");
		tree.traverseInorder(tree.root);
		System.out.println("\nPost Order Traversal: ");
		tree.traversePoster(tree.root);
		
	}
}
