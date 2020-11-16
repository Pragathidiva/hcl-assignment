package com.pojo;

public class Square extends Shapes {
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public Square(String name, int side) {
		super(name);
		this.side = side;
	}

	@Override
	public double calculateArea() {
		double areaofsquare = side * side;
		return areaofsquare;
	}

}
