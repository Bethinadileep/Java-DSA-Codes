//code by: Dileep

package LinkedList_Data_Structure;
import Stack_Data_Structure.Implement_Stack;

import java.util.*;

//Singly Linked List
public class Implement_LinkedList {
    Node head;

    //A LinkedList Node
    //This inner class is Made Static so that the main class can access it
    static class Node {
        int data;
        Node next;

        //Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

        //Method to Insert a Node in LinkedList
        public static Implement_LinkedList insert(Implement_LinkedList list,int data){
            //Create a NewNode with Given Data
            Node new_node = new Node(data);
            new_node.next = null;

            //if newnode is empty
            //Make new node as Head
            if(list.head==null){
                list.head=new_node;
            }
            else{
                //Else traverse till last node
                //ans inser the new_node there
                Node last = list.head;
                while(last.next!=null){
                    last = last.next;
                }
                //Insert new node at last
                last.next = new_node;
            }
            //return list by head
            return list;

        }

        //A Method to print the LinkedList
        public static void printlist(Implement_LinkedList list){
            Node currentnode = list.head;
            System.out.println("LinkedList is....");

            //Traverse through the linkedList
            while(currentnode!=null){
                //print the data
                System.out.print(currentnode.data+"");
                //Go to the next node
                currentnode=currentnode.next;
            }

        }

    public static void main(String args[]){
        //Start with empty list
        Implement_LinkedList list = new Implement_LinkedList();

        //Insert the value
        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);
        list = insert(list,6);
        list = insert(list,7);
        list = insert(list,8);

        //Print the linledlist
        printlist(list);
    }
}
