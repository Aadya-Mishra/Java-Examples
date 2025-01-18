package com.overloading;

public class Overloading {

	void m1() {
		System.out.println("This zero param method");
	}
	void m1(int a) {
		System.out.println("This one int param method");
	}
	
	void m1(int a, float f) {
		System.out.println("This one int and one float param method");
	}
	
	void m1(int a, String s) {
		System.out.println("This one int and one string param method");
	}
	
	void m1(String s1) {
		System.out.println("This one string param method");
	}
	
	String m1(double d) {
		System.out.println("This one double param method");
		return "HI";
	}
	
	void m1(long l){
		System.out.println("This one long param method");
	}
	
	int m1(float f1) {
		System.out.println("This one float param method");
		return 5;
	}
	
	void m1(String s2, double d1) {
		System.out.println("This one string and double param method");
	}
	
	void m1(Overloading obj) {
		System.out.println("This one Overloading param method");
	}
	
	
	void m1(char... a) {
		System.out.println("This one char var-arg param method");
	}
	void m1(char a) {
		System.out.println("This one char param method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Overloading o=new Overloading();
     Overloading o1=new Overloading();
     o.m1();
     o.m1(4);
    int i= o.m1(6.8f);
    System.out.println(i);
     o.m1('b');
    String s= o.m1(5.7);
    System.out.println(s);
   o.m1(1234l);
   o.m1("Hello");
   o.m1(3, 4.5f);
   o.m1(4, "Aadya");
   o.m1("Piyush", 634d);
   o.m1('a','b','c');
   o.m1(o1);
   
   Parent p=new Parent();
  p.m2(2);
  Child c=new Child();
  c.m2();
  Parent p1=new Child();
  p1.m2(2);
  
	}

}
class Parent{
	long m2(int a) {
		System.out.println("This is method of Parent class.");
		return 123l;
	}
}
class Child extends Parent{
	long m2() {
		System.out.println("This is method of Child class.");
		return 123l;
	}
}
