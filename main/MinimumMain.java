package main;

import java.util.Scanner;

import day2assignment.Minimum;

public class MinimumMain {

	public static void main(String[] args) {
		Minimum minimum=new Minimum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int b = scanner.nextInt();
		System.out.println("Enter the third number : ");
		int c = scanner.nextInt();
		minimum.smallnumber(a, b,c);
		scanner.close();

	}

}
