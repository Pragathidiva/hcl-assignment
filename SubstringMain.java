package main;

import java.util.Scanner;

import day3assignment.Substring;

public class SubstringMain {

	public static void main(String[] args) {
		Substring substring = new Substring();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :");
		String string= scanner.nextLine();
		System.out.println("Enter the start index : ");
		int startindex = scanner.nextInt();
		System.out.println("Enter the end index : ");
		int endindex = scanner.nextInt();
		String ans=substring.printsubstring(string, startindex, endindex);
		System.out.println("substring : " +ans);
		scanner.close();

	}

}
