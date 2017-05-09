package com.haripriya.practice;

import java.util.Scanner;

public class AddDigit{
	static int getMaxPairwiseProduct(int numbers[]){
		int result = 0;
		int n = numbers.length;
		for(int i = 0; i<n; i++){
			for (int j = i+1;j<n;j++){
				if(numbers[i]*numbers[j]>result){
					result = numbers[i] * numbers[j];
				}
			}
		}
		return result;
	}

	public static void main(String [] args){
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int numbers[] = new int [n];
		for(int i = 0;i<n; i++){
			numbers[i]= s.nextInt();
		}
		System.out.println(getMaxPairwiseProduct(numbers));
	}
}