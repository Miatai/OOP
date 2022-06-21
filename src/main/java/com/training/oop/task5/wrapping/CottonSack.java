package com.training.oop.task5.wrapping;

public class CottonSack extends Wrapping {
	String name = "Cotton Sack";
	double weightLimit = 150;
	@Override
	public double getWeightLimit() {
		return weightLimit;
	}

}
