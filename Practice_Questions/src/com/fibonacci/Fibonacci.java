package com.fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=0,b=1,c,n=5;
    System.out.println(a);
    System.out.println(b);
  for(int i=2;i<n;i++) {
	  c=a+b;
	    System.out.println(c);
   a=b;
   b=c;
  }
	}

}
