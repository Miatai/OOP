package com.training.oop.task5.sweets;

public class Liquorice extends Sweets {
	private String name = "Liquorice";
	private double weight = 25;

	@Override
	public double getWeight() {
		return this.weight;
	}

	@Override
	public String toString() {
		return name;
	}
}
