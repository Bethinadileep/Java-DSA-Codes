//codeby : Dileep

package LinkedList_DS;
import java.util.*;

public class Doubly_LinkedList {
	Node head;
	class Node{
		int data;
		Node prev;
		Node next;
		
		Node(int d){
			data = d;
				
		}
	}
	public void InsertBegin(int d) {
		Node newNode = new Node(d);
		newNode.next = head;
		newNode.prev = null;
		if(head!=null) {
			head.prev = newNode;
		}
		head = newNode;
	}
	public void InsertMiddle(Node prevNode,int d1) {
		if(prevNode == null) {
			System.out.println("Previous Node Cannot be Null");
			return;
		}
		Node newNode1 = new Node(d1);
		//Set next of previous node to next newnode
		newNode1.next = prevNode.next;
		//set next of prvious node to newnode
		prevNode.next = newNode1;
		//set previous of newnode to previous node
		newNode1.prev = prevNode;
		//set previous of newNodes next to newNode
		if(newNode1.next!=null) {
			newNode1.next.prev=newNode1;
			
		}
	}
	public void DisplayDoublyLinkedList(Node head) {
		while(head != null) {
			System.out.print(head.data+"->");
			head = head.next;
		}
	}
	public void InsertEnd(int data) {
		Node newNode2 = new Node(data);
		newNode2.next = null;
		//store the head data temporarily for later use
		Node temp = head;
		if(head == null) {
			newNode2.prev = null;
			head = newNode2;
			return;
		}
		
		
		if(temp.next!=null) {
			temp=temp.next;
		}
		temp.next = newNode2;
		newNode2.prev = temp;
		
	}
	public void DeleteNode(Node del_Node) {
		if(head == null || del_Node == null) {
			return;
		}
		if(head == del_Node) {
			head = del_Node.next;
		}
		//if last node is not del_node
		if(del_Node.next != null) {
			del_Node.next.prev = del_Node.prev;
		}
		//if first node is not del_node
		if(del_Node.prev != null) {
			del_Node.prev.next = del_Node.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doubly_LinkedList obj = new Doubly_LinkedList();
		obj.InsertBegin(10);
		obj.InsertBegin(20);
		obj.InsertEnd(40);
		obj.InsertMiddle(obj.head,30);
		obj.InsertMiddle(obj.head.next, 450);
		//obj.DisplayDoublyLinkedList(obj.head);
		obj.DeleteNode(obj.head.next.next.next);
		obj.DisplayDoublyLinkedList(obj.head);
	}

}
