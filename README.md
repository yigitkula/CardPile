CardPile
========

GETTING STARTED:

CardPile is easy to use. 
Just create a PileConfig object, set configuration and create a Pile.

-- Sample Code 01 --

PileConfig config = new PileConfig();
CardPile pile = new CardPile(config);

-- End of Sample Code 01  --


CHANGING CONFIGURATIONS:

Default configuration (as seen on Sample Code 01) contains:
- All four suits (Spades, Hearts, Diamonds and Clubs)
- 13 Numbers (From Ace to King)
- A black Joker
- A red Joker


If you like to change configuration it's really simple.

Changing Suits:
Lets say you don't need Spades suit in your pile.
so you should call

-- Sample Code 02 --

PileConfig config = new PileConfig();
CardPile pile = new CardPile(config);

-- End of Sample Code 02  --




