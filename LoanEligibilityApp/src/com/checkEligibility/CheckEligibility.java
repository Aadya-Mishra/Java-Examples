package com.checkEligibility;
import java.util.Scanner;
import com.business.*;
import com.student.*;
import com.home.*;
import com.vehicle.*;
public class CheckEligibility {
public void eligibile() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Select loan type from :: business, student, home, vehicle");
	String loan=sc.next();
	if(loan.equalsIgnoreCase("business")) {
		Business chk=new Business();
		chk.entries();
		chk.loanEligibility();
	}
	else if(loan.equalsIgnoreCase("student")) {
		Student chk=new Student();
		chk.entries();
		chk.loanEligibility();
	}
	else if(loan.equalsIgnoreCase("home")) {
		Home chk=new Home();
		chk.entries();
		chk.loanEligibility();
	}
	else if(loan.equalsIgnoreCase("vehicle")) {
		Vehicle chk=new Vehicle();
		chk.entries();
		chk.loanEligibility();
	}
	else {
		System.out.println("Please select loan type from :: business, student, home, vehicle");
	}
}
}
