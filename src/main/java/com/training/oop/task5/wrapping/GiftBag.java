package com.training.oop.task5.wrapping;

public class GiftBag extends Wrapping {
	String name = "Gift Bag";
	double weightLimit = 500;
	@Override
	public double getWeightLimit() {
		return weightLimit;
	}
}
