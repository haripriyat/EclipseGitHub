package com.oops.concepts;

public class ArrayAdjSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayAdjSum b = new ArrayAdjSum();
		int[] n = {1,6,8,9,17};
		int t = 15;
		b.twoSum(n,t);
		
	}
		public int[] twoSum(int[] numbers, int target) {
		    int l = 0, r = numbers.length - 1;
		    while (numbers[l] + numbers[r] != target) {
		        if (numbers[l] + numbers[r] > target) 
		        	r--;
		        else l++;
		    }
		    System.out.println("index1:" +l+ " " +"index2:"+r);
		    return new int[]{l,r};
		    
		    
		}
	
}