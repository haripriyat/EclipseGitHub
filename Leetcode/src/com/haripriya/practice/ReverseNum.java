package com.haripriya.practice;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int rnum = 0;
		
		System.out.println("Enter the number:");
		
		//taking the input from the user
		Scanner s = new Scanner (System.in);
		
		//Storing the input in the variable created above
		num = s.nextInt();
		
		while(num!= 0){
			rnum = rnum * 10 + num%10; 
			num = num / 10;
			
		}
		
		System.out.println("Reverse number is " +rnum);
		
		
		

	}

}
