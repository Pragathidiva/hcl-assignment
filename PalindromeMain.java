package main;

import java.util.Scanner;

import day3assignment.Palindrome;



public class PalindromeMain {

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :");
		String string= scanner.nextLine();
		palindrome.checkpalindrome(string);
		scanner.close();

	}

}
