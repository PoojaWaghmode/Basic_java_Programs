package com.bridgelabz.day2;

import java.util.Scanner;

public class Trig {

	public static void main(String[] args) {
		double degree;
		double radians=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Degree:");
		degree=s.nextInt();
		System.out.println(radians=Math.toRadians(degree));
		double sinvalue=(Math.sin(radians));
		System.out.println("sin("+degree+")="+sinvalue); 
		double cosvalue=(Math.cos(radians));
		System.out.println("cos("+degree+")="+sinvalue);
		

	}

}
