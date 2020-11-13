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
		Card.Values value;
		Card card = null;
		int deckIndex = 0;
		
			for (int s = 0; s < Card.suits.length; s++) {
//			System.out.println(v);
				for (Card.Values v : Card.Values.values()) {
					suit = Card.suits[s];
					value = v;

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
	// Initializing Cards
//	public void shuffelDeck(Deck deck) {
//		boolean isShuffeled = false;
//
//		for (int d = 1; d < 52; d++) {
//					deck[d] = d;
//		}
//	}

	// Shuffle Deck
	public void shuffle() {
		Card currentCard = deck[0];

		for (int card1 = 0; card1 < 52; card1++) {
			int card2 = nextInt(52);

			Card temp = deck[0];
			Card first = deck[1];
			deck[1] = temp;
		}
		
	}

}
