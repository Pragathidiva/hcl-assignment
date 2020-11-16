package main;

import java.util.Scanner;

import day3assignment.Panagram;

public class PanagramMain {

	public static void main(String[] args) {
		Panagram panagram = new Panagram();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :");
		String string= scanner.nextLine();
		panagram.checkpanagram(string);

	}

}
