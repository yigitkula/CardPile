import java.util.Vector;

import com.yigitkula.cardpile.Card;
import com.yigitkula.cardpile.CardPile;
import com.yigitkula.cardpile.PileConfig;


public abstract class PileTest {
	public static void main(String[] args) {
		PileConfig config = new PileConfig();
		CardPile pile = new CardPile(config);
		Vector<Card> cards = pile.getCards(5, true);
		
		for (Card card : cards) {
			System.out.println(card.getCardSuit() + " - " + card.getCardNumber());
		}
	}
}
