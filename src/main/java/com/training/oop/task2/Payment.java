package com.training.oop.task2;

import java.util.HashMap;
import java.util.Map;

// 2. Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
public class Payment {

	private Map<Product, Integer> cart = new HashMap<>();

	class Product {
		private int productId;
		private String productName;
		private double productPrice;

		public Product(String productName, double productPrice) {
			super();
			this.productName = productName;
			this.productPrice = productPrice;
		}

		public int getProductId() {
			return productId;
		}

		public String getProductName() {
			return productName;
		}

		public double getProductPrice() {
			return productPrice;
		}

		@Override
		public String toString() {
			return "Product [productName=" + productName + ", productPrice=" + productPrice + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + productId;
			result = prime * result + productName.hashCode();
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (getClass() != obj.getClass()) return false;
			Product other = (Product) obj;
			if (productId != other.getProductId()) return false;
			return !productName.equals(other.getProductName()) ? false : true;
		}
	}

	public Payment(Map<Product, Integer> cart) {
		super();
		this.cart = cart;
	}

	public void addProductToCart(Product product, int quantity) {
		if (cart.containsKey(product)) {
			cart.put(product, cart.get(product) + quantity);
		} else {
			cart.put(product, quantity);
		}
	}

	public void removeProductFromCart(Product product, int quantity) {
		if (cart.containsKey(product)) {
			cart.put(product, cart.get(product) - quantity);
			if (cart.get(product) <= 0) {
				cart.remove(product);
			}
		} else {
			System.out.println("Данного продукта нет в корзине.");
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
			sb.append("[" + entry.getKey().toString() + "Quantity = " + entry.getValue() + "],");
		}
		return null;
	}
}
