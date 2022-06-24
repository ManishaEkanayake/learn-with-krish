package com.designpatterns.chainofresponsibility.example;

public class FiveHundredDispenser extends CurrencyDispenser{

	public FiveHundredDispenser() {
		super();
	}
	
	@Override
	public void dispense(Currency currency) {
		
		if (currency != null) {
			 int amount = currency.getAmount();
			 int remainder = amount;
			  if (amount >= 500) {
				  int count = amount / 500;
				  remainder = amount % 500;
				  System.out.printf("Dispensing '%d' 500$ currency note.\n", count);
			  }
			  if (remainder > 0 && this.nextDispenser != null) {
				  this.nextDispenser.dispense(new Currency(remainder));
			  }
		 }
		
	}

}
