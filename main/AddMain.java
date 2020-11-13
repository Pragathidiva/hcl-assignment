package main;

import java.util.Scanner;

import day1assignment.Add;

public class AddMain {
	public static void main(String[] args) {
		Add addition = new Add();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = scanner.nextInt();
		System.out.println("Enter second number:");
		int b = scanner.nextInt();
		int addresult = addition.add(a, b);
		int subresult = addition.sub(a, b);
		int mulresult = addition.mul(a, b);
		int divresult = addition.div(a, b);
		int remresult = addition.rem(a, b);

		System.out.println("Addition of" + a + "and" + b + "is" + addresult);
		System.out.println("Addition of" + a + "and" + b + "is" + subresult);
		System.out.println("Addition of" + a + "and" + b + "is" + mulresult);
		System.out.println("Addition of" + a + "and" + b + "is" + divresult);
		System.out.println("Addition of" + a + "and" + b + "is" + remresult);
		scanner.close();
	}

}
