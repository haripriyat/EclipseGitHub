package com.haripriya.practice;

public class SumNProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		            int num = Integer.parseInt(args[0]);         //taking value as command line argument.

		            int temp = num,result=0;

		            //Logic for sum of digit

		            while(temp>0){

		               result = result + temp;

		               temp--;

		            }

		            System.out.println("Sum of Digit for "+num+" is : "+result);

		            //Logic for product of digit

		            temp = num;

		            result = 1;

		            while(temp > 0){

		                 result = result * temp;

		                 temp--;

		            }

		            System.out.println("Product of Digit for "+num+" is : "+result);

		   }

		}
	


