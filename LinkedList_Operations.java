//codeby : Dileep

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
	void Insertbegin(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}
	
	void InsertAfter(Node prevNode, int val1) {
		if(prevNode == null) {
			System.out.println("Previous Node is Null then we cannot insert at end");
			return;
		}
		Node newNode = new Node(val1);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	
	void InsertEnd(int val2) {
		Node newNode3 = new Node(val2);
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = newNode3;
	}
	//Delete a Node
	void DeleteNode(int index) {
		if(head==null) {
			return;
		}
		
		Node temp = head;
		if(index==0) {
			head = temp.next;
			return;
		}
		
		for(int i=0;i<index-1 && temp!=null;i++) {
			temp=temp.next;
		}
		//If key Not Found
		if(temp == null || temp.next == null) {
			return;
		}
		//Deleting the Node
		Node del = temp.next.next;
		temp.next = del;
	}
	
	//Search a Node 
	boolean search(Node head,int key) {
		Node currentNode = head;
		while(currentNode != null) {
			if(currentNode.data==key)
				return true;
			currentNode=currentNode.next;
		}
		return false;
	}
	
	void sortLinkedList() {
		Node current = head;
		Node index = null;
		int temp;
		
		if(head == null) {
			return;
		}
		else {
			while(current != null) {
				index = current.next;
				
				while(index != null) {
					if(current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
		
	}
	void Display() {
		while(head!=null) {
			System.out.print(head.data+"->");
			head = head.next;
		}
	}
	
	public static void main(String args[]) {
		LinkedList Linkedlist = new LinkedList();
		Linkedlist.Insertbegin(10);
		Linkedlist.Insertbegin(20);
		Linkedlist.InsertEnd(30);
		Linkedlist.InsertAfter(Linkedlist.head.next,25);
		Linkedlist.DeleteNode(2);
		System.out.println(Linkedlist.search(Linkedlist.head,10));
		Linkedlist.Display();
		System.out.println("Sorted Linkedlist");
		Linkedlist.sortLinkedList();
		Linkedlist.Display();
		
	}
}


