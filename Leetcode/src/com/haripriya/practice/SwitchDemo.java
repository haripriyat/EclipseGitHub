package com.haripriya.practice;

import java.util.Scanner;

public class SwitchDemo{



	private static Scanner input;

	public static void main(String []args){
		System.out.println("enter the marks:");
    	input = new Scanner(System.in);
    	int marks = input.nextInt();
    	System.out.println( +marks);
    	
    	switch(marks/10){
    	 case 10:

         case 9:

         case 8:

                  System.out.println("Excellent");

                  break;

         case 7:

                  System.out.println("Very Good");

                  break;

         case 6:

                  System.out.println("Good");

                  break;

         case 5:

                  System.out.println("Work Hard");

                  break;

         case 4:

                  System.out.println("Poor");

                  break;

         case 3:

         case 2:

         case 1:

         case 0:

                  System.out.println("Very Poor");

                  break;

         default:

                  System.out.println("Invalid value Entered");

   
    	}
    	
    }
}