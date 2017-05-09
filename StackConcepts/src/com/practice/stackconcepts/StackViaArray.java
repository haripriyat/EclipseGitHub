package com.practice.stackconcepts;

class StackMethod{
	//Declaring a top pointer, size and creating a stack array
	private int top;
	int size;
	int [] stack;
	
	//Creating a constructor
	public StackMethod(int arraySize){
		size = arraySize;
		stack = new int[size]; //initializing the ArraySize 
	}
	
	//Creating a push method to push elements into the stack
	public void push(int value){
		if(top == size - 1){
			System.out.println("The stack is full, can't push a value");
		}
		else{
			top = top + 1;
			stack[top] = value;
		}
	}
	
	//To pop elements out of the stack
	public void pop(){
		if(!isEmpty()){
			top = top-1;
		}
		else{
			System.out.println("Can't pop, Stack is empty!!");
		}
	}
	
	//IsEmpty method to check if the stack is empty
	public boolean isEmpty(){
		return top == -1;
	}
	
	//To display the elements in the stack 
	public void display(){
		for(int i=0;i<=top;i++){
		System.out.print("[" + stack[i] + "]" + " ");
	}
		System.out.println();
	}
}
public class StackViaArray {
	public static void main(String[] args){
	StackMethod s = new StackMethod(7);
	s.push(20);
	s.push(25);
	s.push(1);
    s.push(50);
    s.push(20);
    s.push(90);

    s.display();
    s.pop();
    s.pop();
    s.pop();
    s.pop();
    s.display();
    s.pop();
    s.pop();
    s.display();
    s.pop();
    s.pop();
    s.display();
}
}
