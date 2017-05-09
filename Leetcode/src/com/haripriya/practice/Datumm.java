package com.haripriya.practice;

import java.util.Scanner;



public class Datumm {

		public static void main(String[] args) {
	        String input = "Welcome to 30 Days of Code!";
	        
	        // Create a Scanner object to read input from stdin.
			Scanner scan = new Scanner(System.in); 
			
			// Read a full line of input from stdin and save it to our variable, inputString.
			String inputString = scan.nextLine(); 
	        

			// Close the scanner object, because we've finished reading 
	        // all of the input from stdin needed for this challenge.
			scan.close(); 
	      
			// Print a string literal saying "Hello, World." to stdout.
			System.out.println("Hello, World.");
	      
		    // TODO: Write a line of code here that prints the contents of inputString to stdout.
	        System.out.println(input);
		}
	}
	