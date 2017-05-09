package com.haripriya.practice;

 import java.util.Scanner;

     public class Solution {

      public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        System.out.println("output is");

        int j ;
        double y ;
        String k ;

        Scanner scan = new Scanner(System.in);    

        j = Integer.parseInt(scan.nextLine());
        y = Double.parseDouble(scan.nextLine());
        k = scan.nextLine();


        System.out.println(j + i);
        System.out.println(d + y);
        System.out.println(s + k);
        scan.close();
}
}
