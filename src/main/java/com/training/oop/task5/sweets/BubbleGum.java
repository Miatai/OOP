package com.training.oop.task5.sweets;

public class BubbleGum extends Sweets {
	private String name = "Bubble Gum";
	private double weight = 10;

	@Override
	public double getWeight() {
		return this.weight;
	}

	@Override
	public String toString() {
		return name;
	}

}
