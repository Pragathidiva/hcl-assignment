package com.pojo;

public class Rectangle extends Shapes {
	private int length;
	private int breadth;

	public Rectangle(String name, int length, int breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		double areaofrectangle = length * breadth;
		return areaofrectangle;
	}

}
