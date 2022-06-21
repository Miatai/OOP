package com.training.oop.task4.treasure;

public class Treasure {
	private String name;
	private TreasureTypes type;
	private double cost;

	public Treasure(String name, TreasureTypes type, double cost) {
		super();
		this.name = name;
		this.type = type;
		this.cost = cost;
	}

	public Treasure() {
		super();
	}

	public String getName() {
		return name;
	}

	public TreasureTypes getType() {
		return type;
	}

	public double getCost() {
		return cost;
	}

	public static Treasure generateRandomTreasure() {

		return new Treasure("Treasure " + (int) (Math.random() * (1000 - 1 + 1)), TreasureTypes.getRandomTreasureType(),
				(int) (Math.random() * (100 - 1 + 1)) + 0);
	}

	@Override
	public String toString() {
		return "Treasure [name=" + name + ", type=" + type + ", cost=" + cost + "]";
	}
}
