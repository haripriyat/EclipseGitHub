package com.oops.concepts;

/*playing with constructors */

/*class Superclass {
	   int age;

	   Superclass(int Myage) {
	      this.age = Myage; 		 
	   }

	   public void getAge() {
	      System.out.println("The value of the variable named age in super class is: " + age);
	   }
	}

	public class Test2 extends Superclass {
	   
	   Test2(int age) {
			super(age);
			
		}
	   public static void main(String argd[]) {
	      Test2 s = new Test2(7979);
	      s.getAge();
	   }
	}

*/

class Arithmetic{
	Arithmetic(){
		
	}
	public static int add(int a, int b){
		int sum;
		sum = a +b;
		return sum;
		
	}
}

class Adder extends Arithmetic{
	Adder(){
		super();
	}
}

public class Test2{
public static void main(String [] args){
	Adder X = new Adder();
	System.out.println("My superclass is: "+X.getClass().getSuperclass().getName());    
    System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");
  
}
}