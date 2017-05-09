package com.oops.concepts;

/* learning inheritance concepts */

class Animals{
	void walk(){
		System.out.println("I can walk");
	}
}

class Birds extends Animals{
	void fly(){
		System.out.println("I can fly");
	}
	
	void sing(){
		System.out.println("I can sing");
	}
}
public class Test1 {

	public static void main(String[] args) {
		
		Birds birdy = new Birds();
		birdy.walk();
		birdy.fly();
		birdy.sing();

	}

}
