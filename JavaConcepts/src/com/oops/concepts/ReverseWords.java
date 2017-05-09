package com.oops.concepts;

import java.util.Scanner;



public class ReverseWords {
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the string to be reversed:");
			String str = scan.nextLine();
		    //Store the sentence into an array by splitting word my word
		    //String words[]=str.split(" ");
		    char value[] = str.toCharArray();
		    //Start printing them from reverse
		    for(int i=value.length-1;i>=0;i--){
		    	str.charAt(i);
		        System.out.print(value[i]);
		    }
		}

	}
		
	      /*String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to reverse");
	      original = in.nextLine();
	      
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      System.out.println("Reverse of entered string is: "+reverse);
	   }
	}*/