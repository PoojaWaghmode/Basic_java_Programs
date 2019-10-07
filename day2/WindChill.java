package com.bridgelabz.day2;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		int t,v;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Temperature Between -58 to 41");
		t=s.nextInt();
		System.out.println("Enter wind speed in miles per hour");
		v=s.nextInt();
		
		double w=35.74+(0.6215*t)+(0.4275*(t*(Math.pow(v,0.16))))-35.75*(Math.pow(v, 0.16));

		System.out.println("Wind Chill="+w);
	}

}
