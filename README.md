CardPile is a playing cards pile framework written in Java.
It's very light, stable and easy to use.


Getting Started
========

CardPile is easy to use.
Just create a `PileConfig` object, set configuration and create a `Pile`.

```java
// Sample Code 01
PileConfig config = new PileConfig(); // create a PileConfig object
CardPile pile = new CardPile(config); // create a Pile
```


Changing Configuration
========

#### Default configuration:

If you run the code on `Sample Code 01` your pile includes;
- All four suits (Spades, Hearts, Diamonds and Clubs)
- 13 Numbers (From Ace to King)
- A black Joker
- A red Joker


#### Including / Excluding:
Lets say you don't need Spades suit in your pile.

```java
// Sample Code 02
PileConfig config = new PileConfig(); // create a PileConfig object

//include - exclude suits
config.excludeSuit(CardSuit.SPADES); // exclude Spades from the pile
config.includeSuit(CardSuit.SPADES); // include Spades from the pile

//include - exclude numbers
config.excludeCard(CardNumber.ACE); // exclude Aces from the pile
config.includeCard(CardNumber.ACE); // include Aces from the pile

//include - exclude jokers
config.excludeCard(Jokers.BLACK); // exclude Black Joker from the pile
config.includeCard(Jokers.RED); // include Red Joker from the pile

CardPile pile = new CardPile(config); // create a Pile
```


Usage
========


```java
// Sample Code 03
PileConfig config = new PileConfig(); // create a PileConfig object
CardPile pile = new CardPile(config); // create a Pile
pile.shuffle(); // shuffle cards
Vector<Card> cards = pile.getCards(5, true); // ask for 5 cards and these cards can include Jokers
//...
//... some code
//...
pile.resetPile(); //reset pile for next hand

```
