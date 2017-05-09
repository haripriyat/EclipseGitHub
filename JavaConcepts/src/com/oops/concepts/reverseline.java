package com.oops.concepts;

import java.util.Scanner;

// Reversing the words in a string
public class reverseline {
	public static void main(String[] args) {
		System.out.print("Enter the original line:");
		Scanner s = new Scanner(System.in);
		System.out.print("Reversed line is: " + reverseLine(s.nextLine()));

	}

	public static String reverseLine(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}

		// split to words by space
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; --i) {
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
	}

}
