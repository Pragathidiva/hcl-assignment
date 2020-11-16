package com.pojo;

public abstract class Shapes {
	private String name;

	public Shapes(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract public double calculateArea();

}
