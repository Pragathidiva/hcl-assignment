package main;

import java.util.Scanner;

import day3assignment.Tolowercase;

public class TolowercaseMain {

	public static void main(String[] args) {
		Tolowercase tolowercase = new Tolowercase();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s1 = scanner.nextLine();
		String lowercase = tolowercase.lower(s1);
		System.out.println("lower case :"+ lowercase);
		scanner.close();
		

	}

}
