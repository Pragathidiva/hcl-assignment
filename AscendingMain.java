package main;

import java.util.Scanner;

import day3assignment.Ascending;

public class AscendingMain {

	public static void main(String[] args) {
		Ascending ascending = new Ascending();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array:");

		int length = scanner.nextInt();
		int[] myArray = new int[length];
		System.out.println("Enter the elements of the array:");

		for (int i = 0; i < length; i++) {
			myArray[i] = scanner.nextInt();

		}
		ascending.ascendingorder(myArray);

		scanner.close();

	}

}
