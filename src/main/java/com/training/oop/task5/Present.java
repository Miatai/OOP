package com.training.oop.task5;

import java.util.ArrayList;
import java.util.List;

import com.training.oop.task5.sweets.Sweets;
import com.training.oop.task5.sweets.SweetsFactory;
import com.training.oop.task5.sweets.SweetsType;
import com.training.oop.task5.wrapping.Wrapping;
import com.training.oop.task5.wrapping.WrappingFactory;
import com.training.oop.task5.wrapping.WrappingType;

public class Present {
	private Wrapping wrapping;
	private List<Sweets> sweetsList = new ArrayList<>();

	public Present(WrappingType wrappingType) {
		super();
		this.wrapping = WrappingFactory.getWrapping(wrappingType);
	}

	public void addSweets(SweetsType sweetsType, int quantity) {
		if (isWeightLimitReached(quantity * SweetsFactory.getSweets(sweetsType).getWeight())) {
			System.out.println("¬ы пытаетесь добавить сладойстей больше, чем может вместить упаковка.");
			return;
		}
		for (int i = 0; i < quantity; i++) {
			sweetsList.add(SweetsFactory.getSweets(sweetsType));
		}
	}

	public boolean isWeightLimitReached(double addedWeight) {
		return getCurrentWeight() + addedWeight > wrapping.getWeightLimit() ? true : false;
	}

	public double getCurrentWeight() {
		double weight = 0;
		for (Sweets sweets : sweetsList) {
			weight += sweets.getWeight();
		}
		return weight;
	}

	public String getSweetsList() {
		return sweetsList.toString();
	}

}
