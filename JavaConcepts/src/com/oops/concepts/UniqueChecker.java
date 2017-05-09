package com.oops.concepts;

import java.util.*;
public class UniqueChecker {
	

		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			String str;
			System.out.print("Enter the String:");
			str= scan.next();
			UniqueChecker uc = new UniqueChecker();
			boolean result = uc.checkUnique(str);
			if(result)
				System.out.println("String has all unique characters");
			else
				System.out.println("String does not have all unique characters");
		}

		public boolean checkUnique(String str){

			HashSet hashSet = new HashSet(str.length());

			for(char c : str.toCharArray()){ //iterate through character array
				if(!hashSet.add(Character.toUpperCase(c)))//try to add each char to hashset
					return false; //return false if could not add
			}
			return true;
		}
	}
		
/*		public static boolean checkUnique(String str){
		    boolean containsUnique = false;

		    for(char c : str.toCharArray()){
		        if(str.indexOf(c) == str.lastIndexOf(c)){
		            containsUnique = true;
		        } else {
		            containsUnique = false;
		        }
		    }

		    return containsUnique;
		}
}
	
	public class UniqueChecker {
		 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter input: ");
	        String input = scanner.nextLine();
	        int[] count = new int[256];
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            count[ch]++;
	        }
	        boolean uniqueString = true;
	        for (int i = 0; i < 256; i++) {
	            if (count[i] > 1) {
	                uniqueString = false;
	                break;
	            }
	        }
	        if (uniqueString) {
	            System.out.println("Unique string");
	        } else {
	            System.out.println("Not a unique string");
	        }
	    }
	}*/