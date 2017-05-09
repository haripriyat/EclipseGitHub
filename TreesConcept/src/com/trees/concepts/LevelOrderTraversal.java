package com.trees.concepts;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {

	public static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data=data;
		}
	}
	
	
	public static void levelOrderTraversal(Node root){
		if(root==null){
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			root = q.poll();
			System.out.print(root.data+ " " );
			if(root.left!=null){
				q.add(root.left);
			}
			if(root.right!=null){
				q.add(root.right);
			}
		}
		
	}
	
	public static void reverseOrderTraversal(Node root){
		if(root==null){
			return;
		}
		Stack<Node> s = new Stack<Node>();
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()){
			root= q.poll();
			if(root.right!=null){
				q.offer(root.right);
			}
			if(root.left!=null){
				q.offer(root.left);
			}
			s.push(root);
		}
		while(!s.isEmpty()){
			System.out.print(s.pop().data + " ");
		}
	}

	public static void main(String[] args)  
	{  
	LevelOrderTraversal bi=new LevelOrderTraversal();  
	// Creating a binary tree  
	Node rootNode=createBinaryTree();  
	System.out.print("Level Order traversal of binary tree will be:");  
	levelOrderTraversal(rootNode);
	
	System.out.println(" ");
	System.out.print("Level order traversal in reverse:");
	reverseOrderTraversal(rootNode);
	}  
  
	public static Node createBinaryTree()  
	{  
   
	 Node rootNode =new Node(10);  
	 Node node20=new Node(20);  
	 Node node30=new Node(30);  
	 Node node40=new Node(40);  
	 Node node50=new Node(50);  
	 Node node60=new Node(60);  
	 Node node70=new Node(70);  
	 Node node80=new Node(80);
	 Node node90=new Node(90);
	 
	 rootNode.left=node20;  
	 rootNode.right=node30;  
	   
	 node20.left=node40;  
	 node20.right=node50;  
	   
	 node30.left=node60;  
	 
	 node60.right=node90;
	 
	 node50.left=node70;
	 node50.right=node80;  
	   
	 return rootNode;  
	}  
	}  

