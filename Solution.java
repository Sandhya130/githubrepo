package com.kod.constructor;
import java.util.Scanner;
public class Solution {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//Student s=new Student(10);
//	}
//}
//class Student extends Object{
//	public Student(int age) {
//		
//	}
//}
//class Teacher {
//	
//}
  public static void main(String[]args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter id");
	  int id=sc.nextInt();
	  System.out.println("enter name");
	  String name=sc.next();
	
	  Solution1 s=new Solution1(id,name);
	  System.out.println(s.id);
	  System.out.println(s.name);
	 s.work();
}
}
  class Solution1{
	  int id;
	  String name;
	  void work() {
		  System.out.println("working");
	  }
	  void study() {
		  System.out.println("studying");
	  }
	  public Solution1(int id,String name) {
		  this.id=id;
		  this.name=name;
	  }
  }

