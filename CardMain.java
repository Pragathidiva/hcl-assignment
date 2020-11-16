package com.main;

import java.util.Scanner;

import com.pojo.Card;
import com.pojo.Membershipcard;
import com.pojo.Paybackcard;

public class CardMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Select the card :");
		System.out.println("1.Paybackcard 2.Membershipcard");
		int userchoice = scanner.nextInt();
		switch (userchoice) {
		// System.out.println("Enter the card details :");
		case 1:
			Card card = new Paybackcard("Anitha", "12345", "19/11/2020", 100, 500000);
			System.out.println("card holder name :" + card.getHolderName());
			System.out.println("card number:" + card.getCardNumber());
			System.out.println("card expiry date :" + card.getExpiryDate());
			break;
		case 2:
			Card card2 = new Membershipcard("pragathi", "3456", "04/11/2021", 5);
			System.out.println("card holder name :" + card2.getHolderName());
			System.out.println("card number: " + card2.getCardNumber());
			System.out.println("card expiry date: " + card2.getExpiryDate());
			break;
		}

	}
}
