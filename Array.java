package com.xworkz.exceptionconcept.arrayoutbound;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String array[] = new String[5];

		System.out.println("Enter the Elements of Array:");
		int i;
		try {
			for (i = 0; i <= 5; i++) {
				array[i] = sc.nextLine();
			}
		} catch (Exception e) {
			System.out.println("The Array length should be 5 only");
		}
	}
}