package com.bridgelabz.day3;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
int start, end, i, j, count=0;
        
        /* to print all the prime numbers between any range
         * enter the two number (starting and ending number)
		 */
        
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter the Range :\n");
		
        System.out.print("Enter Starting Number : ");
        start = scan.nextInt();
        System.out.print("Enter Ending Number : ");
        end = scan.nextInt();
		
        System.out.print("Prime Numbers Between " + start + " and " +end+ " is :\n");
        for(i=start; i<=end; i++)
        {
            count = 0;
            for(j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.print(i + " ");
            }
        }
    
		

	}

}
