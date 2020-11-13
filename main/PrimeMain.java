package main;

import java.util.Scanner;

import day1assignment.Prime;

public class PrimeMain {

	public static void main(String[] args) {
		Prime prime = new Prime();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = scanner.nextInt();
		String result = prime.number(a);
		System.out.println(result);
		scanner.close();

	}

}
