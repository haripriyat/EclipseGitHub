package com.practice.listconcepts;

public class LinkedList {
	/* Head of the list */	
	Node head;
	
	static class Node{
		/* Linked list Node which has data and a pointer pointing
		   towards the next node.  This inner class is made static 
		   so that main() can access it */
		int data;
		Node next;
		
		// Constructor to create a new node
        // Next is by default initialized as null
		Node(int d){
			data = d;
			next = null;
		}
	}
	/* This function is in LinkedList class. Inserts a
    new Node at front(head) of the list. This method is 
    defined inside LinkedList class shown above */

   public void push(int new_data){
    	
	   // 1 & 2 create a new node and put the data into the new node
    	Node new_node = new Node(new_data);
    	
    	//3. make the next of new node as head
    	new_node.next = head;
    	
    	//4. make the head pointer to point the new node
    	head = new_node;
    	
    }
   
   	/* This function is in LinkedList class.
   		Inserts a new node after the given prev_node. This method is 
   		defined inside LinkedList class shown above */
   	public void insertAfter(Node prev_node, int new_data)
   	{
    /* 1. Check if the given Node is null */
   		if (prev_node == null)
   		{
   			System.out.println("The given previous node cannot be null");
   			return;
   		}
 
   		/* 2. Allocate the Node &
       	   3. Put in the data*/
   		Node new_node = new Node(new_data);
 
   		/* 4. Make next of new Node as next of prev_node */
   		new_node.next = prev_node.next;
 
   		/* 5. make next of prev_node as new_node */
   		prev_node.next = new_node;
   	}
   	
   	/* Appends a new node at the end.  This method is 
    defined inside LinkedList class shown above */
   	public void append(int new_data){
   		/* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
   		Node new_node = new Node(new_data);
   		
   		/* 4. If the Linked List is empty, then make the
        new node as head */
   		
   		if(head == null){
   			head = new Node(new_data);
   			return;
   		}
   		/* 5. This new node is going to be the last node, so
        make next of it as null */
   		new_node.next = null;
   		
   		/* 5. Else traverse till the last node */
   	    Node last = head; 
   	    while (last.next != null)
   	        last = last.next;
   	 
   	    /* 6. Change the next of last node */
   	    last.next = new_node;
   	    return;
   	}


	/* This function prints contents of linked list starting from head */
    public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
    
    
	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		//linking the head to the second node 
		l.head.next = second;
		
		//linking the second to the third node
		second.next = third;
		
		l.push(0);
		
		l.insertAfter(second, 4);
		
		l.append(5);
		
		l.printList();
		

	}

}
