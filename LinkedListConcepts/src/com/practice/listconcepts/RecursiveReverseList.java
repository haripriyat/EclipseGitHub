package com.practice.listconcepts;

public class RecursiveReverseList {
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data=d;
			this.next=null;
		}
	}
static Node reverseUntil(Node curr,Node prev){
	//If the last node is null then update the last node as head
	if(curr.next == null){
	head = curr;
	
	//Update the previous node as current's next node
	curr.next = prev;
	return head;
	
}
	//Creating a recursive method so that it would iterate through all the values
	Node next1 = curr.next;
	/* and update next ..*/
    curr.next = prev;

    reverseUntil(next1, curr);
    return head;
}

 static void display(Node node){
	while(node!=null){
		System.out.print(node.data + " ");
		node = node.next;
	}
}
	public static void main(String[] args) {
    RecursiveReverseList.head = new Node(1);
    RecursiveReverseList.head.next = new Node(2);
    RecursiveReverseList.head.next.next = new Node(3);
    RecursiveReverseList.head.next.next.next = new Node(4);
    RecursiveReverseList.head.next.next.next.next = new Node(5);
    RecursiveReverseList.head.next.next.next.next.next = new Node(6);
    RecursiveReverseList.head.next.next.next.next.next.next = new Node(7);
    RecursiveReverseList.head.next.next.next.next.next.next.next = new Node(8);

    System.out.println("Original Linked RecursiveReverseList ");
    RecursiveReverseList.display(head);
    Node res = RecursiveReverseList.reverseUntil(head, null);
    System.out.println("");
    System.out.println("");
    System.out.println("Reversed linked list ");
    RecursiveReverseList.display(res);
}
}

