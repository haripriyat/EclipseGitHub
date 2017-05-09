package com.oops.concepts;

import java.util.HashMap;
import java.util.Scanner;

	
public class AnagramProgram {
	 public static void main(String[] args){

		 if(hasUniqueCharsWithoutAdditionalMem(null, null)){
			 System.out.println("Yes it is a anagram!");
		 }
		 else{
			 System.out.println("Nope it is not an anagram!");
		 }
	 }
		 private static Boolean hasUniqueCharsWithoutAdditionalMem(String input1,String input2){
			 Scanner in = new Scanner(System.in);
			    System.out.println("Enter a string1:");
			    input1 = in.nextLine();
			    System.out.println("Enter a string2:");
			    input2 = in.nextLine();
			    HashMap hm = new HashMap();
				//Set s = new HashSet();
			    String input = input1;
				for(int i=0;i<input.length();i++){
					if(hm.containsKey(input.charAt(i)))
						return false;
					else{
						hm.put(input.charAt(i),null);
					}
				}
				return true;
			}
}