package main;

import java.util.Scanner;

import day3assignment.Searchelement;

public class SearchelementMain {

	public static void main(String[] args) {
		Searchelement searchelement = new Searchelement();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array:");

		int length = scanner.nextInt();
		int[] myArray = new int[length];
		System.out.println("Enter the elements of the array:");

		for (int i = 0; i < length; i++) {
			myArray[i] = scanner.nextInt();

		}
		System.out.println("Enter the key element : ");
		int key = scanner.nextInt();
		searchelement.searchkey(myArray,key);
		scanner.close();
	}

}
