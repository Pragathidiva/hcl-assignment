package main;

import java.util.Scanner;

import day1assignment.Operations;

public class OperationMain {

	public static void main(String[] args) {
		Operations operations = new Operations();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = scanner.nextInt();
		System.out.println("Enter the second number :");
		int b = scanner.nextInt();
		System.out.println("Enter the third number :");
		int c = scanner.nextInt();
		System.out.println("Enter the fourth number :");
		int d = scanner.nextInt();
		System.out.println("Enter the fiveth number :");
		int e = scanner.nextInt();
		System.out.println("Enter the sixth number :");
		int f = scanner.nextInt();
		int res1= operations.operation1(a, b, c);
		int res2= operations.operation2(a, b);
		int res3= operations.operation3(a, b, c,d);
		int res4= operations.operation4(a, b, c,d,e,f);
		System.out.println(" Result is "+res1);
		System.out.println(" Result is "+res2);
		System.out.println(" Result is "+res3);
		System.out.println(" Result is "+res4);
		


		
		scanner.close();
		
		

	}

}
