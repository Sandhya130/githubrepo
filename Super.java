package com.kod.constructor;
class A {
	public A(String b) {
		super();
		System.out.println("1");
	}
	public A(int a) {
		super();
		System.out.println("2");
	}
}
class B extends A{
	public B() {
	super("b");
	System.out.println("3");
}
}


public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b=new B();
	}


}
