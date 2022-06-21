package com.training.oop.task5.sweets;

public abstract class Sweets {
	String name;
	double weight;
	
	public Sweets() {
		super();
	}
	
	public abstract double getWeight();
	public abstract String toString();

}
