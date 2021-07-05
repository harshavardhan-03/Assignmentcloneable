package com.xworkz.exceptionconcept.classcastexception;

public class Employee extends Student {

	public static void main(String[] args) {
		Student Student = new Student();
		try {
			Employee Employee = (Employee) Student;
			Employee.study();
		}
		catch(ClassCastException e) {
			System.out.println("downcasting is not supported in java");
		}	
		Student.study();
	}
}