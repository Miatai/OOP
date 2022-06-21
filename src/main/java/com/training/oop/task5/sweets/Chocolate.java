package com.training.oop.task5.sweets;

public class Chocolate extends Sweets {
	private String name = "Chocolate";
	private double weight = 120;

	@Override
	public double getWeight() {
		return this.weight;
	}

	@Override
	public String toString() {
		return name;
	}
}
