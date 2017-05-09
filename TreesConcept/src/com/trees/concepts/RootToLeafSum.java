package com.trees.concepts;

import java.util.ArrayList;
import java.util.List;

import com.trees.concepts.SizeOfTree.Node;



public class RootToLeafSum {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
		}
	}


	private static Node root;
	public boolean sumOfPath(Node root,int sum,List <Node> result){
		//If root is null return false
		if(root==null){
			return false;
		}
		
		//Checking if it is the leaf node
		if(root.left==null && root.right==null){
			if(root.data==sum){
				result.add(root);
				return true;
			}
			else {
				return false;
			}
		}
		
		if(sumOfPath(root.left, sum-root.data, result) 
		|| sumOfPath(root.right, sum-root.data, result)){
	            result.add(root);
	            return true;
	        }
	        return false;
	    }
	
	
	public static void main(String[] args) {
		RootToLeafSum s = new RootToLeafSum();
        s.root = new Node(10);
		s.root.left = new Node(16);
		s.root.right = new Node(5);
		s.root.left.right = new Node(-3);
		s.root.right.left = new Node(6);
		s.root.right.right = new Node(11);
        List<Node> result = new ArrayList<>();
        boolean r = s.sumOfPath(root, 26, result);
        if(r){
            result.forEach(node -> System.out.print(node.data + " "));
        }else{
            System.out.println("No path for sum "); 
        }
    }
}