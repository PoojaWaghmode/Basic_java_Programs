package com.bridgelabz.day2;

import java.util.Scanner;

public class Stats5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double min = 0,max = 0,sum = 0 ;
		double arr[]=new double[5];
		for(int i=0;i<5;i++)
		{
			double n=Math.random();
			arr[i]=n;
			System.out.println("Random :"+arr[i]);
			min=Math.min(min,arr[i]);
			max=Math.max(max,arr[i]);
			sum=sum+arr[i];
			
		}
		System.out.println("Max In Java:"+max);
		System.out.println("Min in Java:"+min);
		System.out.println("Average In Java:"+sum/5);

	}

}
