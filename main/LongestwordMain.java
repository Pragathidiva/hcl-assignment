package main;

import java.util.Scanner;

import day1assignment.Longestword;

public class LongestwordMain {

	public static void main(String[] args) {

		Longestword longestword = new Longestword();

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string :");
		String s1 = scanner.nextLine();
		String ans = longestword.lengthiestString(s1);
		System.out.println("longest word in the string : " + ans);
		scanner.close();
	}

}
