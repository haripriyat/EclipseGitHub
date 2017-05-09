package com.practice.listconcepts;

/*Iterative reverse LinkedList*/

class ReverseLinkedList {

  static Node head;
  
  static class Node{
	  int data;
	  Node next;
	  
	  Node(int d){
		  this.data=d;
		  this.next=null;
	  }
  }
  
  //function to reverse a linked list
  static Node reverse(Node node){
	  Node prev= null;
	  Node current = node;
	  Node next = null;
	  
	  while(current!=null){
		  next=current.next;
		  current.next=prev;
		  prev=current;
		  current=next;
		  
	  }
	  node=prev;
	  return node;
  }
  static void printList(Node node){
	  while(node!=null){
		  System.out.print(node.data + " ");
		  node=node.next;
	  }
  }
  
  public static void main(String[]args){
	  //ReverseLinkedList l = new ReverseLinkedList();
	  ReverseLinkedList.head=new Node(1);
	  ReverseLinkedList.head.next=new Node(2);
	  ReverseLinkedList.head.next.next=new Node(3);
	  ReverseLinkedList.head.next.next.next=new Node(4);
	  
	  System.out.println("Given LinkedList");
	  ReverseLinkedList.printList(head);
	  System.out.println(" ");
	  head = ReverseLinkedList.reverse(head);
	  System.out.println("Reversed LinkedList:");
	  ReverseLinkedList.printList(head);
	  
  }
  
}