package com.trees.concepts;


/*	class TreeNode{
		int data;
		TreeNode right;
		TreeNode left;
	
	
	public TreeNode(int data){
		this.data=data;
	}
}*/
	class TreeTraversals{
		static TreeNode root;
	
		TreeTraversals(){
			root = null;
		}
	
	
	public static void inOrder(TreeNode root){
		if(root==null){
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public static void postOrder(TreeNode root){
		if(root==null){
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+ " ");
	}
	
	public static void preOrder(TreeNode root){
		if(root==null){
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	 
	public static void main(String[] args) {
		TreeTraversals.root = new TreeNode(1);
		TreeTraversals.root.left = new TreeNode(2);
		TreeTraversals.root.right = new TreeNode(3);
		TreeTraversals.root.left.left = new TreeNode(4);
		TreeTraversals.root.left.right = new TreeNode(5); 
		
		System.out.println("Preorder traversal of binary tree is ");
        preOrder(root);
 
        System.out.println("\nInorder traversal of binary tree is ");
        inOrder(root);
 
        System.out.println("\nPostorder traversal of binary tree is ");
        postOrder(root);
	}
	}

