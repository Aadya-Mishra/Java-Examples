package com.business;
import java.util.Scanner;
public class Business  {
private String name;
private String businessName;
private String address;
private long contactNumber;
private double income;
private double cibilScore;
public void entries() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name::");
	name=sc.next();
	System.out.println("Enter your business name::");
	businessName=sc.next();
	System.out.println("Enter your address::");
	address=sc.next();
	System.out.println("Enter your contact number::");
	contactNumber=sc.nextLong();
	System.out.println("Enter your income::");
	income=sc.nextInt();
	System.out.println("Enter your cibil score::");
	cibilScore=sc.nextDouble();
}
public void loanEligibility() {
	if(cibilScore > 700 && income > 30000) {
		System.out.println(name+" you are eligibile for loan");
		double totalApprovedAmount= income*10;
		double amountAfterInterest= totalApprovedAmount + totalApprovedAmount * 0.1;
		System.out.println("Total tenure will be 48 months");
		System.out.println("Monthly EMI will be "+(int)(amountAfterInterest/48));
	}
	else {
		System.out.println("You are not eligibile for loan");
	}
}
}
