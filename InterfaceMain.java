package com.main;

import java.util.Scanner;

import com.pojo.Javainterface;
import com.pojo.AdvancedArithmetic;

public class InterfaceMain {

	public static void main(String[] args) {
		AdvancedArithmetic javainterface = new Javainterface();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = scanner.nextInt();
		int result = javainterface.divisorSum(number);
		System.out.println("I implemented: AdvancedArithmetic\n" + result);
		scanner.close();

	}

}
