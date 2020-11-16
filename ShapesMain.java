package com.main;
//using abstract class finding the area of shapes

import java.util.Scanner;

import com.pojo.Circle;
import com.pojo.Rectangle;

import com.pojo.Shapes;
import com.pojo.Square;

public class ShapesMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int length = scanner.nextInt();
		System.out.println("Enter the breadth : ");
		int breadth = scanner.nextInt();
		String str = "rectangle";
		Shapes rectangle = new Rectangle(str, breadth, length);
		double result = rectangle.calculateArea();
		System.out.println("area of rectangle :" + result);
		System.out.println("Enter the radius :");
		int radius = scanner.nextInt();
		Shapes circle = new Circle(str, radius);
		double result1 = circle.calculateArea();
		System.out.println("area of circle :" + result1);
		System.out.println("Enter the side :");
		int side = scanner.nextInt();
		Shapes square = new Square(str, side);
		double result2 = square.calculateArea();
		System.out.println("area of square :" + result2);

	}

}
