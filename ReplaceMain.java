package main;

import java.util.Scanner;

import day3assignment.Replace;

public class ReplaceMain {

	public static void main(String[] args) {
		Replace replace = new Replace();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s1 = scanner.nextLine();
		System.out.println("Replaced string :" + replace.repchar(s1));
		scanner.close();
	}

}
