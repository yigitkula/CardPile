package com.yigitkula.cardpile;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;


public class CardPile {
	PileConfig config;
	Vector<Card> cardSet = new Vector<Card>();
	
	Vector<Card> cardsInUse = new Vector<Card>();
	Vector<Card> removedCards = new Vector<Card>();
	
	public CardPile(PileConfig config)
	{
		this.config = config;
		initCards();
	}

	private void initCards() {
		int cardNumber = 0;
		int cardType = 0;
		
		Hashtable<Integer, Integer> suits = config.getSuits();
		Hashtable<Integer, Integer> numbers = config.getNumbers();
		Hashtable<Integer, Integer> jokers = config.getJokers();
		
		Enumeration<Integer> enSuits = suits.elements();
		while (enSuits.hasMoreElements()) {
			Integer suitNum = (Integer) enSuits.nextElement();
			Enumeration<Integer> enCards = numbers.elements();
			while (enCards.hasMoreElements()) {
				Integer cardNum = (Integer) enCards.nextElement();
				cardSet.add(new Card(suitNum, cardNum));
			}
		}
		
		Enumeration<Integer> enJokers = jokers.elements();
		while (enJokers.hasMoreElements()) {
			Integer jokerNum = (Integer) enJokers.nextElement();
			cardSet.add(new Card(CardSuit.JOKER, jokerNum));
		}
		
		resetPile();
	}
	
	public void resetPile()
	{
		cardsInUse.clear();
		removedCards.clear();
		
		cloneCards();
		shufflePile();
	}
	
	private void cloneCards() {
		for (Card card : cardSet) {
			cardsInUse.add(card.getClone());
		}
	}

	public void shufflePile()
	{
		Collections.shuffle(cardsInUse);
	}
	
	public Vector<Card> getCards(int numberOfCards, Boolean includeJokers)
	{
		Vector<Card> returnList = new Vector<Card>(); 
		Random randomGenerator = new Random();
		while(returnList.size() < numberOfCards){
			System.out.println("Selecting card");
			System.out.println("Total Cards: " + cardsInUse.size());
			int randomInt = randomGenerator.nextInt(cardsInUse.size());
			Card tempCard = cardsInUse.get(randomInt);
			
			if(!(includeJokers && tempCard.getCardSuit() == CardSuit.JOKER))
			{
				System.out.println("Card Selected.");
				returnList.add(tempCard);
				removedCards.add(tempCard);
				cardsInUse.remove(randomInt);
				System.out.println("Total Cards: " + cardsInUse.size());
			}
		}
		return returnList;
	}
	
	
}
