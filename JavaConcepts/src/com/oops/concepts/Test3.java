package com.oops.concepts;

import java.util.Scanner;
		//A program to check if two strings are equal
	class Test3{
		public static void main(String[] args){
			for(int i=0;i<5;i++) {
		         for(int j=0;j<5-i;j++) {
		             System.out.print(" ");
		         }
		        for(int k=0;k<=i;k++) {
		            System.out.print("* ");
		        }
		        System.out.println();  
		    }

		}
	}
/*		{
			public void testCase(int randomValue){
				String test = null;
				boolean val;
				if(randomValue%2==0){
					val=test.contains("abc");
				}
				else{
					test = "abc";
					val=test.contains("abc");
				}
				System.out.println(val);
			}
			public static void main (String[] args)
			{
			
				Test3 t = new Test3();
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the string");
				int input = scan.nextInt();
				t.testCase(input);
				
				
		}
		}*/
	
	
	


