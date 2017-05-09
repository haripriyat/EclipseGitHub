package com.haripriya.practice;

public class ReverseStringTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  String input="AliveisAwesome";
			  StringBuilder input1 = new StringBuilder();
			  input1.append(input);
			  input1=input1.reverse(); 
			  for (int i=0;i<input1.length();i++)
			  System.out.print(input1.charAt(i));  
	}}

/*1.  In the second method , we will use the built in reverse() 
 * method of the StringBuilder class ,.
 
Note :  String class does not have reverse() method . 
So we need to convert the input string to StringBuilder , 
which is achieved by using the append method of the StringBuilder.

The StringBuilder class, like the String class, has a length() method 
that returns the length of the character sequence in the builder.it has a capacity
of 16 elements


2.  After that print out the characters of the reversed string  by 
scanning from the first till the last index.

charAt method Returns a char at the specified index.
*/