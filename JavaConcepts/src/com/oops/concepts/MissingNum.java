package com.oops.concepts;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MissingNum {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int[] a = {4,7,9};
		Arrays.sort(a);
		for(int x : a){
		System.out.print(x+  " ");
		}
		int j = a[0];
	
		for (int i=0;i<a.length;i++)
		{
		    if (j==a[i])
		    {
		        j++;
		        continue;
		    }
		    else
		    {
		        arr.add(j);
		        
		        i--;
		        System.out.println("i:"+i);
		        
		    j++;
		    System.out.println("j:"+j);
		    }
		}
		System.out.println("");
		System.out.println("missing numbers are ");
		for(int r : arr)
		{
		    System.out.print(" " + r);
		}
	}

}

		
