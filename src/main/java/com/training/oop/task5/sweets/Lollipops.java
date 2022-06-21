package com.training.oop.task5.sweets;

public class Lollipops extends Sweets {
	private String name = "Lolliopops";
	private double weight = 50;

	@Override
	public double getWeight() {
		return this.weight;
	}

	@Override
	public String toString() {
		return name;
	}
}
