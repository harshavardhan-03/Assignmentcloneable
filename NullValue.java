package com.xworkz.exceptionconcept.nullpointer;

import java.util.Scanner;

public class NullValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {	
			System.out.println("Enter a number:");
			int number = sc.nextInt();
			System.out.println("Given number is: "+number);
		}
		catch(Exception e) {
			System.out.println("Can't take null value. Enter valid number");
		}
	}

}