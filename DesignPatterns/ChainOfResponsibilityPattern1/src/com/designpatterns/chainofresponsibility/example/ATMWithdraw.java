package com.designpatterns.chainofresponsibility.example;

public class ATMWithdraw {
	
	
	 protected static CurrencyDispenser fiveHundredDispenser = new FiveHundredDispenser();
	 protected static CurrencyDispenser twoHundredDispenser = new TwoHundredDispenser();
	 protected static CurrencyDispenser hundredDispenser = new HundredDispenser();
	 protected static CurrencyDispenser fiftyDispenser = new FiftyDispenser();
	 protected static CurrencyDispenser dispenserChain;
	 

	 static {
		  // construct the chain of the currency dispensers in higher to lower
	      // denomination
		 fiveHundredDispenser.setNextDispenser(twoHundredDispenser);
		 twoHundredDispenser.setNextDispenser(hundredDispenser);
		 hundredDispenser.setNextDispenser(fiftyDispenser);
		 dispenserChain = fiveHundredDispenser;
	 }
	 
	 public static void withdraw(Currency currency) {
		 if (currency != null) {
			  dispenserChain.dispense(currency);
		 }
	 }

}
