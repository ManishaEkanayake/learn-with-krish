package com.designpatterns.chainofresponsibility.example;

public class HundredDispenser extends CurrencyDispenser{

	public HundredDispenser() {
		super();
	}
	
	@Override
	public void dispense(Currency currency) {
		
		 if (currency != null) {
			 int amount = currency.getAmount();
			 int remainder = amount;
			  if (amount >= 100) {
				  int count = amount / 100;
				  remainder = amount % 100;
				  System.out.printf("Dispensing '%d' 100$ currency note.\n", count);
			  }
			  if (remainder > 0 && this.nextDispenser != null) {
				  this.nextDispenser.dispense(new Currency(remainder));
			  }
		 }
	}

}
