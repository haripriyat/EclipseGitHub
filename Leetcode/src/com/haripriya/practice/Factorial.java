package com.haripriya.practice;

/*import java.util.Scanner;

public class Factorial {

	//private static Scanner num;

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the num:");
		num = new Scanner(System.in);
		int n = num.nextInt();
		int fact = 1;
		System.out.println(n);
		
		while(n>0){
			fact = n * fact;
			n--;
			
		}
		
		System.out.println("Factorial of Given no. is : "+fact);
	}

}

		
		

	    public static void main(String[] args) {
	    	int fact = 0;
		    int num = 0;
	         Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
	        if (num == 1){
	            return fact = num * fact(num-1);
	        }
	        
	        
	            
	    }System.out.println(fact);
	}*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factorial {
    
   
	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter the number whose factorial is to be found: ");
	       int n = scanner.nextInt();
	       int result = factorial(n);
	       System.out.println("The factorial of " + n + " is " + result);
	   }

	   public static int factorial(int n) {
	       int result = 1;
	       for (int i = 1; i <= n; i++) {
	           result = result * i;
	       }
	       return result;
	   }
	}