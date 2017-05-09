/**
 * 
 */
package com.trees.concepts;


/**
 * @author haripriya
 *
 */
public class IsBST {

static Node root;
	
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
	
	public static boolean isBST(){
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	//Checking if a tree is a BST or not
	public static boolean isBST(Node root,int min,int max){
		if(root==null){
			return true;
		}
		if(root.data<=min || root.data>max){
			return false;
		}
		
		return isBST(root.left,min,root.data) &&
				isBST(root.right,root.data,max);
	}
	
	public static void main(String[] args) {
		//IsBST s = new IsBST();
		IsBST.root = new Node(10);
		IsBST.root.left = new Node(4);
		IsBST.root.right = new Node(17);
		IsBST.root.left.left = new Node(-5);
		IsBST.root.left.right = new Node(7);
		IsBST.root.right.left = new Node(12);
		IsBST.root.right.right = new Node(22);
		
		
		System.out.println("Is is it a bst? ");
		System.out.println(isBST());
		
		

	}

}
