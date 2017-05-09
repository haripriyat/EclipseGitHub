package com.trees.concepts;

import java.util.Stack;

	class TreeNode{
	int data;
	TreeNode right;
	TreeNode left;
	
	TreeNode(int data){
		this.data=data;
	}
}

public class ItrativeTreeTraversal {
	//inorder iterative tree traversal ---> (left,root,right)
	void inorderTraversal(TreeNode root){
		//if the root is null then return nothing
		if(root==null){
			return;
		}
		//initialize a stack
		Stack <TreeNode> s = new Stack<TreeNode>();
		//while the root is not null
		while(true){
			//if the root is not null then push the root into the stack
			if(root!=null){
				s.push(root);
				//traverse left make the root as left
				root=root.left;
			}
			//If the left is empty then break
			else{
				if(s.isEmpty()){
					break;
					}
				}
			//Pop everything from the stack and print all the elements
			root = s.pop();
			System.out.println(root.data + " ");
			//Then traverse right and follow the above procedure
			root = root.right;
		}
	}
	
	//preorder traversal ---> root,left,right
	void preorderTraversal(TreeNode root){
		if(root==null){
			return;
		}
		//initialize a stack
		Stack<TreeNode> p = new Stack<TreeNode>();
		//add the root to the stack
		p.push(root);
		//while the stack is not empty do the following
		while(!p.isEmpty()){
			//pop the root and print it
			root= p.pop();
			System.out.println(root.data+ " ");
			//if the root's right is not null then push it into the stack
			if(root.right!=null){
				p.push(root.right);
			}
			//Similarly if the root's left is not null then push into the stack
			if(root.left!=null){
				p.push(root.left);
			}
		}
	}
	
	//postorder traversal ---> left,right,root
	void postorderTraversal(TreeNode root){
		if(root==null){
			return;
		}
		//initialize two stacks
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		//push the root to stack1
		s1.push(root);
		//while stack1 is not empty
		while(!s1.isEmpty()){
			//pop the root from the stack and then push it to stack2
			root = s1.pop();
			s2.push(root);
			
			//Traverse left if the root's left is not null and then push it to stack1
			if(root.left!=null){
				s1.push(root.left);
			}
			
			//Traverse right if the root's right is not null and then push it to stack2
			if(root.right!=null){
				s1.push(root.right);
			}
		}
		
		//while stack2 is not empty keep popping out the elements and then print it from the stack
		while(!s2.isEmpty()){
			root = s2.pop();
			System.out.println(root.data+ " ");
		}
	}
	
	
}

