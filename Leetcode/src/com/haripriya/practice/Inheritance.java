package com.haripriya.practice;

import java.util.Scanner;

public class Inheritance {
	
	protected String name;
	protected int rollnum;
	
	Inheritance(String name,int rollnum){
		name = this.name;
		rollnum = this.rollnum;
	}	
		public void display(){
		System.out.println("Please enter the student's details:");
		System.out.println("enter the name: " +name);
		System.out.println("enter the roll number: " +rollnum);
	}
		

}
//Some errors exist in the class below need to fix it
/*public class Marks extends Inheritance{
	private int[] testScores;	
	
	Marks(String name, int rollnum) {
		super(name, rollnum);
		
	}	
		public void cal(){
		if(testScores >= 90 && testScores < 100){
			return o;
		}
		if(testScores >= 75 && testScores < 90){
			return A;
		}
		if(testScores >= 60 && testScores < 75){
			return B;
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int rollnum = sc.nextInt();
		int testScores = sc.nextInt();
		Inheritance inh = new Marks(name,rollnum,testScores);
		inh.display();
		Marks m = (Marks)inh;
		System.out.println("grades" + m.cal());

	}

}
*/