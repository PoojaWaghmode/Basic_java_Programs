package com.bridgelabz.day1;

class RuntimeErrorDemo
{
	void show()
	{
		System.out.println("Show Method");
	}
}
public class Data extends Exception {
	
	public void display() {
 		System.out.println("Display Method");
 	}
	public static void main(String args[])
	{
		RuntimeErrorDemo d=new RuntimeErrorDemo();
	//	d.display();
		
	}

}
