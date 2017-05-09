package com.haripriya.practice;

public class ReverseString {
 public static void main(String[] args) {
  String input = "Hello";
  
  //getBytes()  method  is used to convert the input string into bytes[]
  byte [] aa = input.getBytes();
  
  //Then we will create a temporary byte[]  of length 
  //equal to the length of the input string.
  byte [] result = new byte [aa.length];
   
  for(int i = 0; i<aa.length; i++){
	  
  //We will store the bytes(which we get by using getBytes() method) 
	  //in reverse order   into the temporary byte[] .

  result[i] = aa[aa.length-i-1];
  }
  System.out.println(new String(result));
   }
 }