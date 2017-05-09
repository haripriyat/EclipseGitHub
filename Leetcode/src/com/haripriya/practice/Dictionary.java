package com.haripriya.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to print the number of entries 
		System.out.println("Enter the number of entries:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//creating a new map of string key to string values
		Map phonebook = new HashMap<String,String>();
		for(int i=0;i<n;i++){
			String name = scan.next();
			int phone = scan.nextInt();
			phonebook.put(name, phone);
		}
		while(scan.hasNext()){
            String s = scan.next();
            if(phonebook.get(s)!=null){
                System.out.println(s+"="+phonebook.get(s));
		}
		else{
			System.out.println("Not found");
		}
	}scan.close();

	}
}
