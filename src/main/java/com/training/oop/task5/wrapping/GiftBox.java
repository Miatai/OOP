package com.training.oop.task5.wrapping;

public class GiftBox extends Wrapping {
	String name = "Gift Box";
	double weightLimit = 400;
	@Override
	public double getWeightLimit() {
		return weightLimit;
	}

}
