package com.designpatterns.chainofresponsibility.example;

import java.util.Scanner;

public class ChainOfResponsibilityDemo {
	
	 public static void main(String[] args) {
		 
		 try (Scanner scanner = new Scanner(System.in)) {
			 do {
				 System.out.println( "Please enter amount to withdraw (multiple of 10, max 1000$, Press Ctrl + C to end): ");
				 int amount = scanner.nextInt();
				 if (isValid(amount)) {
					 ATMWithdraw.withdraw(new Currency(amount));
				 }
			 }while(true);
		 }
	 }

	private static boolean isValid(int amount) {
		if (amount <= 0) {
			 System.out.println("Invalid amount. Please Try again!");
			 return false;
		}else if (amount > 1000) {
			 System.out.println("Daily withdrawal limit is 10000$. Please Try again!");
			 return false;
		}else if (amount % 10 != 0) {
			System.out.println("Amount should mutiple of 10s, Please Try again!");
			 return false;
		}
		return false;
	}

}
