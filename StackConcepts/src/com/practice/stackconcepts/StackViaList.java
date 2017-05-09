package com.practice.stackconcepts;

import java.io.IOException;


	class Node
	{
	    public int data;
	    public Node next;
	    public Node(int val)
	    {
	        data = val;
	    }
	    public void displayNode()
	    {
	        System.out.println("[" + data + "] ");
	    }
	}
	class LinkedList
	{
	    private Node head;
	    public LinkedList()
	    {
	        head = null;
	    }
	    public boolean isEmpty()
	    {
	        return (head==null);
	    }
	    public void insert(int val)//inserts at beginning of list
	    {
	        Node newNode = new Node(val);
	        newNode.next = head;
	        head = newNode;
	    }
	    public Node delete()//deletes at beginning of list
	    {
	        Node temp = head;
	        head = head.next;
	        return temp;
	    }
	    public void display()
	    {
	        System.out.println("Elements from top to bottom");
	        Node current = head;
	        while(current != null)
	        {
	            current.displayNode();
	            current = current.next; 
	        }
	        System.out.println("");
	    }
	     
	}
	class Stack
	{
	    private LinkedList listObj;
	    public Stack()  
	    {   
	        listObj = new LinkedList();
	    }
	    public void push(int num)
	    {
	        listObj.insert(num);
	    }
	    public Node pop()
	    {
	        return listObj.delete();
	    }
	    public boolean isEmpty()
	    {
	        return listObj.isEmpty();
	    }
	    public void displayStack()
	    {
	        System.out.print("Stack : ");
	        listObj.display();
	    }
	} 
	class StackViaList
	{
	    public static void main(String[] args) throws IOException
	    {
	        Stack demo = new Stack(); 
	        demo.push(10); 
	        demo.push(20); 
	        demo.displayStack(); 
	        demo.push(30); 
	        demo.push(40); 
	        demo.displayStack(); 
	        demo.pop(); 
	        demo.pop(); 
	        System.out.println("Two elements are popped");
	        demo.displayStack(); 
	    } 
	}