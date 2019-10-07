package com.bridgelabz.day1;

import java.util.Scanner;

public class InOpt {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Value For A:");
        int a=sc.nextInt();
        
        System.out.print("Enter Value For B:");
        int b=sc.nextInt();
        
        System.out.print("Enter Value For C:");
        int c=sc.nextInt();
        System.out.println("Result:"+(a+b*c));
        System.out.println("Result:"+(a*b+c));
        System.out.println("Result:"+(c+b/a));
        System.out.println("Result:"+(a%b+c));
       
        
        
        
        

	}

}
