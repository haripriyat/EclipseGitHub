package com.trees.concepts;

public class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data=data;
		left=right=null;
	}
}

public class SameTree{
	Node root1, root2;
	
	//Given two trees, return true if they are structurally identical 
	public boolean identicalTrees(Node root1,Node root2){
		
		//both empty
		if(root1 == null && root2 == null){
			return true;
		}
		
		//Either of them is empty
		if(root1 == null || root2 == null){
			return false;
		}
		
		//Recursive function to check every node 
		return root1.data==root2.data &&
				identicalTrees(root1.left,root2.left) &&
				identicalTrees(root1.right,root2.right);
		
	}
	
	
	public static void main(String[] args){
		SameTree s = new SameTree();
		
		s.root1 = new Node(1);
		s.root1.left = new Node(2);
		s.root1.right = new Node(4);
		s.root1.left.left = new Node(88);
		s.root1.left.right = new Node(6);
		
		
		s.root2 = new Node(1);
		s.root2.left = new Node(2);
		s.root2.right = new Node(4);
		s.root2.left.left = new Node(5);
		s.root2.left.right = new Node(6);
		
		if(s.identicalTrees(s.root1, s.root2)){
			System.out.println("Both trees are identical");
		}
		else 
	        System.out.println("Trees are not identical");
		}
	
	}

