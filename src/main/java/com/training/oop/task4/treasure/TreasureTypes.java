package com.training.oop.task4.treasure;

public enum TreasureTypes {
	SWORD,
	SHIELD,
	ARMOR,
	BRACELET,
	RING,
	NECKLACE;
	
	public static TreasureTypes getRandomTreasureType() {
		return TreasureTypes.values()[(int) (Math.random() * (5 - 0 + 1)) + 0];
	}

}
