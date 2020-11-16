package main;

import java.util.Scanner;

import day3assignment.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number :");
		int num1 = scanner.nextInt();
		System.out.println("enter the second number :");
		int num2 =scanner.nextInt();
		System.out.println("sum is "+calculator.add(num1, num2));
		
	}

}
