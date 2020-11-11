
public class BlackjackDriver {

	public static void main(String[] args) {
		int blackjack = 21;
		Deck blackjackDeck = new Deck();
		System.out.println(blackjackDeck);
		// Shuffle Deck
		for (int x = 0; x < Deck.length; x++) {
			int index = (int) (Math.random() * Deck.length);
			int temp = deck[x];
			deck[x] = deck[index];
			deck[index] = temp;
			System.out.println(Num + " of " + Card);
		}
		//Draw
		for (int x = 22; x <= 22; x++) {
			System.out.println("Bust");
		}
	}

//	static int Cards(int userInput) {
//		int card = userInput;
//		for (int i = userInput; i >= 0; i--) {
//			card = card * (i);
//		}
	}