package com.oops.concepts;

import java.util.*;
public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = "Hello this is my world!";
		StringTokenizer st = new StringTokenizer(s,"! ");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		

	}

}
