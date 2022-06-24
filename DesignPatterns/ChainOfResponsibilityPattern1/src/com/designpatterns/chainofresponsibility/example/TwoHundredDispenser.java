package com.designpatterns.chainofresponsibility.example;

public class TwoHundredDispenser extends CurrencyDispenser {

	public TwoHundredDispenser() {
		super();
	}
	
	@Override
	public void dispense(Currency currency) {
		
		if (currency != null) {
			 int amount = currency.getAmount();
			 int remainder = amount;
			  if (amount >= 200) {
				  int count = amount / 200;
				  remainder = amount % 200;
				  System.out.printf("Dispensing '%d' 200$ currency note.\n", count);
			  }
			  if (remainder > 0 && this.nextDispenser != null) {
				  this.nextDispenser.dispense(new Currency(remainder));
			  }
		 }
	}

}
