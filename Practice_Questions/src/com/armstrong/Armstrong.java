package com.armstrong;
import java.util.*;
import java.lang.Math;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n1,n2,digit=0,last=0,sum=0;
   System.out.println("Enter the number :: ");
   Scanner sc=new Scanner(System.in);
   n1=sc.nextInt();
   n2=n1;
   while(n1>0) {
	   n1 /=10;
	   digit++;
   }
   n1=n2;
   while(n1>0) {
	   last=n1%10;
	   sum=(int) (sum+(Math.pow(last,digit)));
	   n1 /=10;
   }
   if(sum==n2) {
	   System.out.println("Number is armstrong.");
   }
   else {
	   System.out.println("Number is not armstrong.");
   }
	}

}
