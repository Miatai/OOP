package com.training.oop.task5.wrapping;

public class WrappingFactory {
	public static Wrapping getWrapping(WrappingType wrappingType) {
		switch (wrappingType) {
		case COTTON_SACK: return new CottonSack();
		case GIFT_BAG: return new GiftBag();
		case GIFT_BOX: return new GiftBox();
		case ROUND_TIN: return new RoundTin();
		}
		
		throw new UnsupportedOperationException("Данная упаковка не поддерживается: " + wrappingType.toString());
	}

}
