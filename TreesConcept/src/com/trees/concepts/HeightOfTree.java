		package com.trees.concepts;


public class HeightOfTree {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			left=right=null;
		}
	}

	private Node root;
	
	int height(){
		return height(root);
	}
	
	int height(Node root){
		if(root==null){
		return 0;
		}
		int leftheight = height(root.left);
		int rightheight = height(root.right);
		return 1 + Math.max(leftheight, rightheight);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeightOfTree tree = new HeightOfTree();
		tree.root = new Node(10);
		tree.root.left = new Node(5);
		tree.root.right = new Node(6);
		tree.root.right.left = new Node(8);
		tree.root.right.right = new Node(7);
		tree.root.right.right.right = new Node(4);
		
		System.out.println("Height of the tree is:" + tree.height());

	}

}
