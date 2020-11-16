package com.pojo;

public class Circle extends Shapes {

	private int radius;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		double areaofcircle = 3.14 * radius * radius;
		return areaofcircle;
	}

}
