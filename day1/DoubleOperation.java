package com.bridgelabz.day1;

import java.util.Scanner;

public class DoubleOperation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Value For A:");
        double a=sc.nextDouble();
        
        System.out.print("Enter Value For B:");
        double b=sc.nextDouble();
        
        System.out.print("Enter Value For C:");
        double c=sc.nextDouble();
        System.out.println("Result:"+(a+b*c));
        System.out.println("Result:"+(a*b+c));
        System.out.println("Result:"+(c+b/a));
        System.out.println("Result:"+(a%b+c));
	}

}
