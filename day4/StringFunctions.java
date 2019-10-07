package com.bridgelabz.day4;

import java.util.Arrays;
import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First String:");
		String str1=s.nextLine();
		
		System.out.println("Enter Second String:");
		String str2=s.nextLine();
		
		System.out.println("1.Anagram");
		System.out.println("2.Palindrome");
		System.out.println("3.Permutation");
		System.out.println("Enter Your Choice");
	    int ch=s.nextInt();
		
	    do
	    {
	    	
	    	switch(ch)
	    	{
	    	case 1:
	    		System.out.println("Anagram Of String");
	    		isAnagram(str1,str2);
	    		break;
	    		
	    	case 2:
	    		System.out.println("Palindrome Of String");
	    		isPalindrome(str1);
	    		break;
	    	case 3:
	    		break;
	    	default:
	    		
	    		
	    	}
	    }while(ch!=4);
	    
	    
	   
	}
	 public static void isAnagram(String str1, String str2) 
	{  
	        String s1 = str1.replaceAll("\\s", "");  ///Removes white spaces
	        String s2 = str2.replaceAll("\\s", "");  
	        boolean status = true;  
	        if (s1.length() != s2.length())
	        {  
	            status = false;  
	        } 
	        else 
	        {  
	            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        }  
	        if (status) 
	        {  
	            System.out.println(s1 + " and " + s2 + " are anagrams");  
	        } 
	        else 
	        {  
	            System.out.println(s1 + " and " + s2 + " are not anagrams");  
	        }  
	   }  
	 public static boolean isPalindrome(String str1)
	   {
		 String rev="";
	      int length = str1.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str1.charAt(i);
	 
	      if (str1.equals(rev))
	         return true;
	      else
	         return false;
	   }
	   

}
