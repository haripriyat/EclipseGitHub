package com.oops.concepts;

import java.util.*;
public class SubStrings {
	private static Scanner s;

	public static void main(String[]args){
		s = new Scanner(System.in);
		String word = "Helloworld";
		System.out.println(word);
		int start = s.nextInt();
		int end = s.nextInt();
		
		String subString = word.substring(start,end);
		System.out.println(subString);
	}
}
