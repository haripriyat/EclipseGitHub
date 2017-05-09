package com.haripriya.practice;

import java.util.Scanner;

public class BinaryNumbers {
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, tempAns = 0;
        while(n>0){
            if(n%2==1){
            ans++;
            System.out.println(ans);
            } 
            n = (int) Math.floor(n/2);
            if(n%2==0){
                if(ans>=tempAns){
                    tempAns = ans;
                    ans = 0;    
                } else {
                    ans= 0;
                }
            }
        }
        if(ans>=tempAns){
            System.out.println(ans);
        } else{
            System.out.println(tempAns);
        }
    }
}

