package com.haripriya.practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
public class ReviewCode
{
    
    public static void evenOdd(char[] array){
        int length = array.length;
        for(int i=0;i<length;i+=2){
            System.out.print(array[i]);
        }
        System.out.print(" ");
        for(int i=1;i<length;i+=2){
            System.out.print(array[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       sc.nextLine();
        //System.out.println("");
       //for(int i=0;i<n;i++){
           String s = sc.nextLine();
           evenOdd(s.toCharArray());
      // }  
    }
}