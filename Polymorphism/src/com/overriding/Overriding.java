package com.overriding;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p1=new Parent();

p1.study();
p1.food();
p1.sleep();
System.out.println(p1.a);
Child1 c1=new Child1();
c1.study();
c1.food();
System.out.println(c1.a);
c1.sleep();
Child2 c2=new Child2();
c2.study();
c2.food();
c2.sleep();
Child3 c3=new Child3();
c3.study();
c3.food();
c3.sleep();

Parent p2=new Child1();
p2.study();
p2.walk(1,2,3,4);
System.out.println(p2.a); 
Child4 c4=new Child4();
c4.vehicle();
Parent p3=new Child2();
p3.food();

	}

}
class Parent{
	int a=4;
	int study() {
		System.out.println("Should study for 8hrs");
		return 3;
	}
	static void food() {
		System.out.println("Have healthy food");
	}
	Parent sleep() {
		System.out.println("Sleep for 7hrs");
		return new Parent();
		}
	
	void walk(int... b) {
		System.out.println("Var-arg method of Parent");
	}
}
class Child1 extends Parent{
	int a=5;
	int study() {
		System.out.println("Should study for 6hrs");
		return 4;
	}
	
	void walk(int... b) {
		System.out.println("Var-arg mathod of Child");
	}
}
class Child2 extends Parent{
	 static void food() {
		System.out.println("Have healthy food and also fast food");
	}
}
class Child3 extends Parent{
	Child3 sleep() {
		System.out.println("Sleep for 10hrs");
		return new Child3();
	}
}
abstract class Parent1{
	abstract void vehicle();
}
class Child4 extends Parent1{
	void vehicle() {
		System.out.println("I will buy a Car");
	}
}
