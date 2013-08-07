package com.yigitkula.cardpile;

import java.util.Hashtable;


public class PileConfig {
	private Hashtable<Integer,Integer> cardSuits = new  Hashtable<Integer,Integer>();
	private Hashtable<Integer, Integer> cardNumbers = new Hashtable<Integer,Integer>();
	private Hashtable<Integer, Integer> jokerCards = new Hashtable<Integer,Integer>();
	
	public PileConfig()
	{
		initConfig();
	}
	
	private void initConfig()
	{
		cardSuits.put(CardSuit.HEARTS,CardSuit.HEARTS);
		cardSuits.put(CardSuit.SPADES,CardSuit.SPADES);
		cardSuits.put(CardSuit.DIAMONDS,CardSuit.DIAMONDS);
		cardSuits.put(CardSuit.CLUBS,CardSuit.CLUBS);
		
		cardNumbers.put(CardNumber.ACE,CardNumber.ACE);
		cardNumbers.put(CardNumber.TWO,CardNumber.TWO);
		cardNumbers.put(CardNumber.THREE,CardNumber.THREE);
		cardNumbers.put(CardNumber.FOUR,CardNumber.FOUR);
		cardNumbers.put(CardNumber.FIVE,CardNumber.FIVE);
		cardNumbers.put(CardNumber.SIX,CardNumber.SIX);
		cardNumbers.put(CardNumber.SEVEN,CardNumber.SEVEN);
		cardNumbers.put(CardNumber.EIGHT,CardNumber.EIGHT);
		cardNumbers.put(CardNumber.NINE,CardNumber.NINE);
		cardNumbers.put(CardNumber.TEN,CardNumber.TEN);
		cardNumbers.put(CardNumber.JACK,CardNumber.JACK);
		cardNumbers.put(CardNumber.QUEEN,CardNumber.QUEEN);
		cardNumbers.put(CardNumber.KING,CardNumber.KING);

		jokerCards.put(CardNumber.JOKER_BLACK, CardNumber.JOKER_BLACK);
		jokerCards.put(CardNumber.JOKER_RED, CardNumber.JOKER_RED);
	}
	
	
	public void includeSuit(int suit)
	{
		if(!cardSuits.contains(suit))
			cardSuits.put(suit, suit);
	}
	
	public void excludeSuit(int suit)
	{
		if(cardSuits.contains(suit))
			cardSuits.remove(suit);
	}
	
	public void includeCard(int cardNumber)
	{
		if(!cardNumbers.contains(cardNumber))
			cardNumbers.put(cardNumber, cardNumber);
	}
	
	public void excludeCard(int cardNumber)
	{
		if(cardNumbers.contains(cardNumber))
			cardNumbers.remove(cardNumber);
	}
	
	public void includeJoker(int jokerNum)
	{
		if(!jokerCards.contains(jokerNum))
			jokerCards.put(jokerNum, jokerNum);
	}
	
	public void excludeJoker(int jokerNum)
	{
		if(jokerCards.contains(jokerNum))
			jokerCards.remove(jokerNum);
	}
	
	
	public Hashtable<Integer, Integer> getSuits()
	{
		return cardSuits;
	}
	
	public Hashtable<Integer, Integer> getNumbers()
	{
		return cardNumbers;
	}
	
	public Hashtable<Integer, Integer> getJokers()
	{
		return jokerCards;
	}
	
	
	
}
