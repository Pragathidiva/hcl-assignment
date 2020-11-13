package main;

import java.util.Scanner;

import day2assignment.Vowels;

public class MainVowels {

	public static void main(String[] args) {
		Vowels vowels= new Vowels();
		Scanner scanner = new  Scanner(System.in);
		System.out.println("Enter the string :");
		String s1 = scanner.nextLine();		
        int res = vowels.vowelscount(s1);
        
        System.out.println("Number of vowels: " + res);
        scanner.close();
	}

}
