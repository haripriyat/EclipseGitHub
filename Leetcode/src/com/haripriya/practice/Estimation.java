package com.haripriya.practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Estimation {

	public static void main(String[] args) throws ClassNotFoundException{
		try{
			String line= "null";
			Scanner scan = new Scanner(System.in);
			File file = new File("D:\\Calcuate.txt");
			
			if(file.exists()){
				FileReader fr = new FileReader(file);
    		    LineNumberReader lnr = new LineNumberReader(fr);
    		    
    		    int linenumber = 0;
    		    int count = 0;
    		    int empty_lines=0;
    		    int inc = 0;
    		    
    		    
    		    
    		    
    		    while ((line=lnr.readLine()) != null){
    		    /*This condition is used to calculate the 
    		     * total number of lines including the spaces
    		     * and excluding the comments
    		     */
	            	if(!(line.startsWith("//") || line.startsWith("/**") || 
	            		line.startsWith(" *") || line.startsWith(" */") || 
	            		line.startsWith("/*")))
						linenumber++;
	            	else
	            	{
	            		count++;	
	            	}
	            	//This condition is for counting the empty lines
	            	if(line.trim().isEmpty())
	            	{
	            		empty_lines++;
	            	}
	            	//This condition is for counting the number of classes
	            	if((line.startsWith("public class")) || 
	            			(line.startsWith("class"))){
	            		inc++;
	            	}
			}
    		    System.out.println("Total number of classes: " +inc);
	            System.out.println("Total number of comment lines :" +count);
	            System.out.println("Total number of empty lines : "+empty_lines);
	            System.out.println("Total number of lines : " + linenumber);
	            
	            
			}
			
			
			else{
				System.out.println("File does not exists");
			}
			
		
	}
		catch(IOException e){
    		e.printStackTrace();
		}
		
	}
}
