package main;

import java.util.Scanner;

import day1assignment.Sumodd;

public class SumoddMain {

	public static void main(String[] args) {

		Sumodd sumodd = new Sumodd();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scanner.nextInt();
		int ans = sumodd.sumoddnumber(a);
		if (ans == 1) {
			System.out.println("sum of digits is odd ");
		} else {
			System.out.println("sum of digits is even");
		}
		scanner.close();

	}

}
