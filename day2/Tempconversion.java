package com.bridgelabz.day2;

import java.util.Scanner;

public class Tempconversion {

	public static void main(String[] args) {
		float far ,celcius;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Temperature In Farenhite:");
		far=s.nextInt();
		celcius=(far-32)*5/9;
		System.out.println("Celcius Temperature"+celcius);
		System.out.print("Enter Temperature In Celcius:");
		celcius=s.nextInt();
		far=(celcius*9/5)+32;
		System.out.println("Farenhite Temperature"+far);
		
		

	}

}
