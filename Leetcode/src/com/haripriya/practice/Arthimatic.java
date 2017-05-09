package com.haripriya.practice;

import java.util.Scanner;

public class Arthimatic {


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        double mealCost = scan.nextDouble(); // original meal price
	        int tipPercent = scan.nextInt(); // tip percentage
	        int taxPercent = scan.nextInt(); // tax percentage
	        scan.close();
	      
	        // Write your calculation code here.
	        float tip = (float) (mealCost * ((float)tipPercent/100));
	        System.out.println("tip" +tip);
	        float tax = (float)(mealCost * ((float)taxPercent/100));
	        float tot = (float) (mealCost + tip + tax);
	      
	        // cast the result of the rounding operation to an int and save it as totalCost 
	        int totalCost =(int) Math.round(tot);
	      
	        // Print your result
	        System.out.println("The total meal cost is "+ totalCost + " dollars");
	    }
	}