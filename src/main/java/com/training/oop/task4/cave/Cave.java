package com.training.oop.task4.cave;

import java.util.ArrayList;
import java.util.List;

import com.training.oop.task4.treasure.Treasure;

public class Cave {
	private List<Treasure> treasures = new ArrayList<>();

	public Cave(List<Treasure> treasures) {
		super();
		this.treasures = treasures;
	}

	public List<Treasure> getTreasures() {
		return new ArrayList<>(treasures);
	}

	public Treasure getMostExpensiveTreasure() {
		Treasure result = new Treasure();
		double maxCost = 0;
		for (Treasure treasure : treasures) {
			if (maxCost < treasure.getCost()) {
				maxCost = treasure.getCost();
				result = treasure;
			}
		}
		return result;
	}

	public List<Treasure> getTreasuresOnSpecifiedCost(double cost) {
		List<Treasure> result = new ArrayList<>();
		for (Treasure treasure : treasures) {
			if (treasure.getCost() <= cost) {
				result.add(treasure);
				cost -= treasure.getCost();
			}
		}
		return result;
	}

	public static Cave generateRandomCave() {
		Cave cave = new Cave(new ArrayList<Treasure>());
		for (int i = 0; i < 100; i++) {
			cave.addTreasure(Treasure.generateRandomTreasure());
		}
		return cave;
	}

	private void addTreasure(Treasure treasure) {
		treasures.add(treasure);
	}

	@Override
	public String toString() {
		return "Cave [treasures=" + treasures + "]";
	}

}
