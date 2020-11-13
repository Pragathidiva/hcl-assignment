package main;

import java.util.Scanner;

import day1assignment.Ascii;

public class AsciiMain {

	public static void main(String[] args) {
		Ascii ascii = new Ascii();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char char1 = scanner.next().charAt(0);
		int ans = ascii.character(char1);
		System.out.println("The ASCII value of " + char1 + " is: " + ans);
		scanner.close();
		
	}

}
