package com.pojo;

public class Output {
	
		public static void main(String[] args) {
			FirstClass objA = new FirstClass(); 
			SecondClass objB = new SecondClass();
			System.out.println("in main(): "); 
			System.out.println("objA.a = "+objA.getFirstClass()); 
			System.out.println("objB.b = "+objB.getSecondClass()); 
			objA.setFirstClass (222); 
			objB.setSecondClass (333.33); 
			System.out.println("objA.a = "+objA.getFirstClass());
			System.out.println("objB.b = "+objB.getSecondClass()); 
			} 
		} 

		public class FirstClass {

		int a = 100;

		public FirstClass () {

		System.out.println("in the constructor of class FirstClass: ");
		System.out.println("a = "+a); a = 333;
		System.out.println("a = "+a); 
		} 
		public void setFirstClass( int value) { 
			a = value; 
		} 
		public int getFirstClass() 
		{
			return a; 
			}
		} //class FirstClass

}
