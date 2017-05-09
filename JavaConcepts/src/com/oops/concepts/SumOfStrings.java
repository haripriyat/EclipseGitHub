package com.oops.concepts;

import java.util.*;
public class SumOfStrings {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A,B;
		scan = new Scanner(System.in);
		System.out.println("Enter String1:");
		A = scan.nextLine();
		System.out.println("Enter string2:");
		B = scan.nextLine();
		
		int len1,len2;
		len1 = A.length();
		len2 = B.length();
		int sum = len1+len2;
		System.out.println("Sum="+sum);
		
		if(len1>len2){
			System.out.println("Yes A's length is greater");
		}
		else{
			System.out.println("No A's length is not greater");
		}
		
		System.out.println((A.compareTo(B)>0)?"Yes":"No");
		System.out.println(A + " " +B);
		System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1));
	}

}
