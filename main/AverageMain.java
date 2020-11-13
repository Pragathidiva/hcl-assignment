package main;

import java.util.Scanner;

import day1assignment.Average;

public class AverageMain {

	public static void main(String[] args) {
		Average avg=new Average();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = scanner.nextInt();
		System.out.println("Enter second number:");
		int b = scanner.nextInt();
		System.out.println("Enter third number:");
		int c = scanner.nextInt();
		int mean = avg.average(a, b,c);
		System.out.println("The Average of three numbers is " + mean);
		scanner.close();
		avg=null;

	}

}
