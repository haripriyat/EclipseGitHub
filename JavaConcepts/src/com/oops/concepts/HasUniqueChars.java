package com.oops.concepts;

//Needed practice - forgot about the two possible ways - with HashMap and with CharArray. Needed to look back more. Once looked back- it was easy only.
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class HasUniqueChars {

	public HasUniqueChars() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String input = "Rahul";
		System.out.println( hasUniqueChars(input));
		System.out.println(hasUniqueCharsWithoutAdditionalMem("TOTOO"));
		//Checking hasUniqueChars my own solution using XOR.
		System.out.println(hasUniqueCharsWithoutAdditionalDSOrMemXOR("input"));
		
		//CHecking permutation
		System.out.println("Is a permutation?"+isAPermutation("rahul","halur"));
		System.out.println("Is a permutation?"+isAPerm("rahul","halur"));
		
		
	}

	//using additional datastructure
	private static Boolean hasUniqueChars(String input) {
		HashMap hm = new HashMap();
		//Set s = new HashSet();
		for(int i=0;i<input.length();i++){
			if(hm.containsKey(input.charAt(i)))
				return false;
			else{
				hm.put(input.charAt(i),null);
			}
		}
		return true;
	}
	
	//without using an additional data structure - using a constant sized char array
	private static Boolean hasUniqueCharsWithoutAdditionalMem(String input){
		boolean[] charCount = new boolean[256];
		for(int i=0;i<input.length();i++){
			if(charCount[input.charAt(i)]){ //Remember that this statement works only if the charCount array is a boolean as that initializes stuff. However if we used Boolean then we would get a NullPointerExp
				return false;
			}
				charCount[input.charAt(i)] = true;
		}
		return true;
	}
	
	//The below one hasUniqueCharsWithoutAdditionalDSOrMemXOR is wrong and wont work.
	
	private static Boolean hasUniqueCharsWithoutAdditionalDSOrMemXOR(String input){
		int result = input.charAt(0);
		for(int i=1;i<input.length();i++){
			result^=input.charAt(i);
			if(result==0)
				return false;
		}
		return true;
	}
	
	//check if two strings are permutations of each other
	private static Boolean isAPermutation(String s1, String s2){
		if(s1.length()!=s2.length())
			return false;
		int[] char_set = new int[100];
		for(int i=0;i<s1.length();i++) {
			char_set[s1.charAt(i) - '0']++; //Remember that u are subtracting a '0' in this case because u took an int array of size only 100. U could avoid the -'0' if the array size is 256
		}
		for(int i=0;i<s2.length();i++){
			char_set[s2.charAt(i) - '0']--;
		}
		for(int i=0;i<s1.length();i++) {
			if(char_set[s1.charAt(i) - '0'] != 0)
			return false;
		}
		return true;
	}
	
	//Same function as above - but much simpler to understand and lesser time complexity.
	private static boolean isAPerm(String s1, String s2){
		if(s1.length()!=s2.length())
			return false;
		int[] charArr = new int[256];
		for(int i=0;i<s1.length();i++)
		{
			charArr[s1.charAt(i)]++;
			charArr[s2.charAt(i)]--;
		}
		for(int j=0;j<s1.length();j++){
			if (charArr[s1.charAt(j)]!=0)
				return false;
		}
		return true;
	}
}
