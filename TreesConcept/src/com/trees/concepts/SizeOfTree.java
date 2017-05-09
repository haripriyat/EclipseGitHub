package com.trees.concepts;

//A recursive Java program to calculate the size of the tree


	

/* Class to find size of Binary Tree */
public class SizeOfTree {
	Node root;
	
	/* Class containing left and right child of current
	node and key value*/
	public static class Node
	{
		int data;
		Node left, right;

		public Node(int data)
		{
			this.data=data;
			
		}
	}
	
	 /* Given a binary tree. Print its nodes in level order
    using array for implementing queue */
	int size()
	{
     return size(root);
	}
	
	/* computes number of nodes in tree */
	int size(Node root){
		if(root==null){
		return 0;
		}
		int leftsize = size(root.left);
		int rightsize = size(root.right);
		return leftsize+rightsize+1;
	}

	public static void main(String[] args) {
		/* creating a binary tree and entering the nodes */
		SizeOfTree s = new SizeOfTree();
		s.root = new Node(1);
		s.root.left = new Node(2);
		s.root.right = new Node(3);
		s.root.left.left = new Node(4);
		s.root.left.right = new Node(5);
		s.root.right.left = new Node(6);
		s.root.right.right = new Node(7);
		
		System.out.println("Size of the tree: " + s.size());
		
	}

}

