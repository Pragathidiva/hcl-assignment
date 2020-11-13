package main;

import java.util.Scanner;

import day1assignment.Sumofdigits;

public class SumofdigitsMain {

	public static void main(String[] args) {
		Sumofdigits sumofdigits = new Sumofdigits();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scanner.nextInt();
		int res = sumofdigits.sumevenumber(a);
		System.out.println("sum of square even digits :"+res);
		scanner.close();

	}

}
