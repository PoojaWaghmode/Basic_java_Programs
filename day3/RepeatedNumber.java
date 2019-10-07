package com.bridgelabz.day3;

import java.util.Random;
import java.util.Scanner;

public class RepeatedNumber {

	
		 void printRepeating(int arr[], int size)  
		    { 
		        int i, j; 
		        System.out.println("Repeated Elements are :"); 
		        for (i = 0; i < size; i++)  
		        { 
		            for (j = i + 1; j < size; j++)  
		            { 
		                if (arr[i] == arr[j])  
		                    System.out.print(arr[i] + " "); 
		            } 
		        } 
		    } 
		 
		   
		    public static void main(String[] args)  
		    { 
		    	RepeatedNumber repeat = new RepeatedNumber(); 
		    	Random r=new Random();
		       //  int arr[] = {11, 22, 44, 55, 22, 33, 11,44}; 
		    	int arr[]=new int[100];
		    	Scanner s=new Scanner(System.in);
		    	//System.out.print("Enter Elements In Array:");
		    	int n=r.nextInt();
		    	for(int i=0;i<100;i++)
		    	{
		    	   arr[i]=r.nextInt(100);
		    	   //System.out.println(arr[i]);
		    	}
		         int arr_size = arr.length; 
		        repeat.printRepeating(arr, arr_size); 
		        
		    } 

	

}
