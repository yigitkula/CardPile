package com.yigitkula.cardpile;

public class Card {
	private int cardSuit = -1;
	private int cardNumber = -1;
	
	public Card(int cardSuit, int cardNumber)
	{
		this.cardSuit = cardNumber;
		this.cardNumber = cardNumber;
	}

	public int getCardNumber() {
		return cardNumber;
	}
	
	public int getCardSuit() {
		return cardSuit;
	}

	public Card getClone() {
		return new Card(cardSuit, cardNumber);
	}
}
