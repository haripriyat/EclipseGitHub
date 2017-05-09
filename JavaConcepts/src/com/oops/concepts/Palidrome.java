package com.oops.concepts;

import java.util.Scanner;

public class Palidrome {
	
	   public static void main(String args[])
	   {
		  /*if(isPalindrome(null)){
			  System.out.println("Yay! the string is palindrome!!");
	   }
		  else{
			  System.out.println("Oops! its not a palindrome");
		  }
}
	      
static boolean isPalindrome(String s) {
    boolean bP = true;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string:");
    s = in.nextLine();
    for(int i=0; i<s.length(); i++) {
        if(s.charAt(i) != s.charAt(s.length()-i-1)) {
            bP = false;
        }
    }
    return bP;
}
}*/
		   String inputString;
		    Scanner in = new Scanner(System.in);
		 
		    System.out.println("Input a string");
		    inputString = in.nextLine();
		 
		    int length  = inputString.length();
		    int i, begin, end, middle;
		 
		    begin  = 0;
		    end    = length - 1;
		    middle = (begin + end)/2;
		 
		    for (i = begin; i <= middle; i++) {
		      if (inputString.charAt(begin) == inputString.charAt(end)) {
		        begin++;
		        end--;
		      }
		      else {
		        break;
		      }
		    }
		    if (i == middle + 1) {
		      System.out.println("Palindrome");
		    }
		    else {
		      System.out.println("Not a palindrome");
		    } 	
		  }
		}