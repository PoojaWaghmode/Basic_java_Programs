package com.bridgelabz.day4;

import java.util.Arrays;

public class StringAnagram {

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
	   
	    public static void main(String[] args) 
	    {  
	    	isAnagram("Heart","earth");
	    	isAnagram("Keep", "Peek");  
	    	isAnagram("Mother In Law", "Hitler Woman"); 
	    	isAnagram("Hii","iihi");
	    }  

	

	
	

}
