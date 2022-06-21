package com.training.oop.task5.sweets;

public class SweetsFactory {
	public static Sweets getSweets(SweetsType sweetsType) {
		switch (sweetsType) {
		case CHOCOLATE:
			return new Chocolate();
		case LIQUORICE:
			return new Liquorice();
		case LOLLIPOPS:
			return new Lollipops();
		case BUBBLE_GUM:
			return new BubbleGum();
		}
		throw new UnsupportedOperationException("Данная сладость не поддерживается: " + sweetsType.toString());
	}

}
