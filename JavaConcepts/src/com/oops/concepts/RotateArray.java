package com.oops.concepts;

public class RotateArray {

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,6,7};
		for(int x =0;x<n.length-1;x++){
		System.out.print(n[x]);
		}
		int s = 3;
		rotate(n, s);
		for(int x =0;x<n.length-1;x++){
		System.out.println("after rotations:"+ n[x]);
		}
	}
	public static void rotate(int[] nums,int k){
		if(nums==null||nums.length<2){
			return;
		}
		
		reverse(nums,0,nums.length-k-1);
		reverse(nums,nums.length-k,nums.length-1);
		reverse(nums,0,nums.length-1);
		//System.out.print(reverse(nums,0,nums.length-1));
		
	}
		public static void reverse(int[]nums,int i,int j){
			int tmp=0;
			while(i<j){
				tmp=nums[i];
				nums[i]=nums[j];
				nums[j]=tmp;
				i++;
				j--;
			}
			
		}
	}


