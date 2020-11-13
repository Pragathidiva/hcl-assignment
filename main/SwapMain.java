package main;

import java.util.Scanner;

import day1assignment.Swap;

public class SwapMain {

	public static void main(String[] args) {
		Swap swap = new Swap();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = scanner.nextInt();
		System.out.println("Enter second number:");
		int b = scanner.nextInt();
		System.out.println("befor swapping : a is "+a+"and b is "+ b);
		swap.change(a, b);
		//System.out.println("befor swapping : a is "+a+"and b is "+ b);
		scanner.close();


	}

}
