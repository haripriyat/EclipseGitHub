package com.trees.concepts;

public class BinarySearchTree {
	
	public static class TreeNode{
	TreeNode right;
	TreeNode left;
	int data;
	
	TreeNode(int data){
		this.data=data;
	}
	}
	
	public static TreeNode search(TreeNode root,TreeNode key){
		if(root==null){
			return null;
		}
		
		if(root.data==key.data){
			return root;
		}
		else if(root.data>key.data){
			return search(root.left,key);
		}
		else {
			return search(root.right,key);
		}
	}
	
	
	public static TreeNode insert(TreeNode root,TreeNode nodeToBeInserted){
		if(root==null){
			root=nodeToBeInserted;
			return root;
		}
		
		if(root.data>nodeToBeInserted.data){
			if(root.left==null){
				root.left=nodeToBeInserted;
			}
			else{
				insert(root.left,nodeToBeInserted);
			}
		}
		
		else if(root.data<nodeToBeInserted.data){
			if(root.right==null){
				root.right = nodeToBeInserted;
			}
			else{
				insert(root.right,nodeToBeInserted);
			}
		}
		return root;
	}
	
	public static void inOrder(TreeNode root){
		if(root==null){
			return;
		}
		inOrder(root.left);
		System.out.printf(root.data + " ");
		inOrder(root.right);
	}
	
	public static void preorder(TreeNode root) {  
	    if(root !=  null) {  
	   //Visit the node-Printing the node data   
	    System.out.print(" ");
	      System.out.print(root.data + " ");  
	      preorder(root.left);  
	      preorder(root.right);  
	    }  
	  }  
	
	public static void postorder(TreeNode root){
		if(root!=null){
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
	}

		public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		  TreeNode rootNode= createBinarySearchTree();  
		  TreeNode node55=new TreeNode(55);  
		  search(rootNode,node55);  
		  System.out.println("Searching for node 55 : " + search(rootNode,node55));  
		  System.out.println("---------------------------");  
		  TreeNode node13=new TreeNode(13);  
		  TreeNode root=insert(rootNode,node13);  
		  System.out.println("Inorder traversal of binary tree after adding 13:");  
		  inOrder(root);  
		  System.out.println(" ");
		  System.out.println("Using Recursive solution:");    
		  preorder(root);  
		  System.out.println("PostOrder");
		  postorder(root);
		 }     
		   
		 public static TreeNode createBinarySearchTree()  
		 {  
		  TreeNode rootNode =new TreeNode(40);  
		  TreeNode node20=new TreeNode(20);  
		  TreeNode node10=new TreeNode(10);  
		  TreeNode node30=new TreeNode(30);  
		  TreeNode node60=new TreeNode(60);  
		  TreeNode node50=new TreeNode(50);  
		  TreeNode node70=new TreeNode(70);  
		  TreeNode node5=new TreeNode(5);  
		         TreeNode node55=new TreeNode(55);  
		  
		  insert(null,rootNode);  
		  insert(rootNode,node20);  
		  insert(rootNode,node10);  
		  insert(rootNode,node30);  
		  insert(rootNode,node60);  
		  insert(rootNode,node50);  
		  insert(rootNode,node70);  
		  insert(rootNode,node5);  
		  insert(rootNode,node55);  
		  return rootNode;  
		 }  
		  
		}  

		