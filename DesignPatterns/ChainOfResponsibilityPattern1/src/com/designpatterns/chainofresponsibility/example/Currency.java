package com.designpatterns.chainofresponsibility.example;

public class Currency {
	
	protected int amount;
	
	public Currency(int amount) {
		 super();
		this.amount=amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
