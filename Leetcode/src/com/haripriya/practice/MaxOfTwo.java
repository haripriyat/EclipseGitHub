package com.haripriya.practice;

/*public class MaxOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 3;
		if(x>y)
			System.out.println(+x + " is greater than " + y);
		else
			System.out.println(+y + " is greater than " + x);
	}

}*/

class MaxOfTwo{

	  public static void main(String args[]){

	      //taking value as command line argument.

	      //Converting String format to Integer value

	      int i = Integer.parseInt(args[0]);

	      int j = Integer.parseInt(args[1]);

	      /*if(i > j)

	          System.out.println(i+" is greater than "+j);

	      else

	          System.out.println(j+" is greater than "+i);
           */
	      int result = (i<j)?i:j;

	      System.out.println(result+" is a minimum value");
	  }

	}
