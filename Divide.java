package com.xworkz.exceptionconcept.arithmeticexception;

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {	
			System.out.println("Enter dividend ");
			int dividend = sc.nextInt();
			
			System.out.println("Enter Divisor");
			int divisor = sc.nextInt();
			
			int value = dividend/divisor;
			System.out.println(dividend+" / "+divisor+" = "+value);
		}
		catch(Exception e) {
			System.out.println("Enter non zero value");
		}
	}
}