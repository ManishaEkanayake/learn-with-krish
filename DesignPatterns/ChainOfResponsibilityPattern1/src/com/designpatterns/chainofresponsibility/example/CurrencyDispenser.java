package com.designpatterns.chainofresponsibility.example;

public abstract class CurrencyDispenser {

	 protected CurrencyDispenser nextDispenser;
	 
	 public void setNextDispenser(CurrencyDispenser nextDispenser) {
		 this.nextDispenser = nextDispenser;
	 }
	 
	 public abstract void dispense(Currency currency);
}
