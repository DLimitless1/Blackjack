import java.util.Arrays;

public class Deck {

	// Attributes
	Card[] deck;
	boolean isShuffeled;

	// Constructor
	public Deck() {
		this.deck = new Card[52];
		this.isShuffeled = false;
		makeDeck();
	}
	
	public void makeDeck() {
		String suit = "";
		String value = "";
		Card card = null;
		int deckIndex = 0;
		
			for (int s = 0; s < Card.suits.length; s++) {
//			System.out.println(v);
				for (int v = 0; v < Card.values.length; v++) {
					suit = Card.suits[s];
					value = Card.values[v];

//				System.out.println(s);
					card = new Card(suit, value);
					deck[deckIndex] = card;
					deckIndex++;		
//				System.out.println(this.deck[d]);
				}
			}
		}

	@Override
	public String toString() {
		String output = "";
		for (int d = 0; d < deck.length; d++) {
			output += deck[d] + "\n";
		}
		return output;
	}
}
