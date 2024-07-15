package com.student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
private String name;
private String address;
private long contactNumber;
private String education;
private double income;
private double cibilScore;
public void entries() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name::");
	name=sc.next();
	System.out.println("Enter your address::");
	address=sc.next();
	try {
		System.out.println("Enter your contact number::");
		contactNumber=sc.nextLong();
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter only integers");
		}
	System.out.println("Enter your education::");
	education=sc.next();
	System.out.println("Enter your parents' income::");
	income=sc.nextDouble();
	System.out.println("Enter your parents' cibil score::");
	cibilScore=sc.nextDouble();
}
public void loanEligibility() {
	if(cibilScore > 450 && income > 15000) {
		System.out.println(name+" you are eligibile for loan");
		double totalApprovedAmount= income*10;
		double amountAfterInterest= totalApprovedAmount + totalApprovedAmount * 0.01;
		System.out.println("Total tenure will be 48 months");
		System.out.println("Monthly EMI will be "+(int)(amountAfterInterest/48));
	}
	else {
		System.out.println("You are not eligibile for loan");
	}
}
}
