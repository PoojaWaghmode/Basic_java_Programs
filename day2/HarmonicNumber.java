package com.bridgelabz.day2;

import java.util.Scanner;

public class HarmonicNumber { 
    public static void main(String[] args) { 

        // command-line argument
    	
   /*     int n = Integer.parseInt((args[0]));       */
    	Scanner s=new Scanner(System.in);
    	System.out.print("Enter number:");
    	int n=s.nextInt();

        // compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        // print the nth harmonic number
        System.out.println("Harmonic No:"+sum);
    }

}