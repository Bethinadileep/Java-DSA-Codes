//codeby: Dileep

package LinkedList_DS;

import java.util.*;

public class LinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static void main(String args[]) {
		LinkedList Linkedlist = new LinkedList();
		
		//Assign Value Values
		Linkedlist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		//Connect Nodes
		Linkedlist.head.next = second;
		second.next = third;
		
		//printing the linkedlist
		while(Linkedlist.head != null) {
		System.out.print(Linkedlist.head.data + "->");
			Linkedlist.head = Linkedlist.head.next;
		}
		
		
	}
}


