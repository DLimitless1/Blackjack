import java.util.Random;
import java.util.Scanner;

public class BlackjackDriver {

	public static void main(String[] args) {
		// Attributes
		int blackjack = 21;
		int[] deck = new int[52];
		boolean isShuffeled;
		boolean showHand;
		boolean playCard;
		boolean stay = false;
	}

	private Card[] deck;
	private static final Random random = new Random();
	private int currentCard;

	// These are the playing options
	public final static String[] playCard = { "Stand", "Hit", "Double", "Bust", "Surrender" };

	// These are the players
	public static String[] players = { "Player1", "Player2", "Player3" };
	public static String[] dealer = { "dealer" };

	// Initializing Cards
	public void shuffelDeck(Deck deck) {
		boolean isShuffeled = false;

		for (int d = 1; d < 52; d++) {
//					deck[d] = d;
		}
	}

	// Shuffle Deck
	public void shuffle() {
		currentCard = 0;

		for (int card1 = 0; card1 < 52; card1++) {
			int card2 = random.nextInt(52);

			Card temp = deck[first];
			deck first = deck[second];
			deck[second] = temp;
		}
	}

	public Card dealNextCard() {
			
			//Get top card
			Card topCard = this.deck[0];
			
			for(int currentCard = 1; currentCard < 52; currentCard++) {
				this.deck[currentCard-1] = this.deck[currentCard];
			}
			this.deck[52] = null;
			this.52--;
			
	Scanner scanner = new Scanner(System.in);
	String player = scanner.nextLine();
	players = scanner.nextLine();
	
	if (player.equalsIgnoreCase("Yes")) {
		Deck deck1 = new Deck();
		Card card = new Card();
		deck.shuffleDeck();
		System.out.println("Shuffel Deck");	
	
	// Deal
		//Round 1
		players.addCard(deck1.dealNextCard());
		
		//Round 2
		players.addCard(deck1.dealNextCard());
		
		players.getPlayerHand(true);
		System.out.println(" ");
		
		dealer.getPlayerHand(false);
		
//	public void deal() {
//		for (int d = 1; d < 52; d++) {
//			String Card = Card[deck[d] / 52];
//			String Card = Card[deck[d] % 52];
			remainingCards--;
		
		System.out.println("Remaining Cards: " + remainingCards);
	}
	// Play Card
	public void playCard(Card card) {
		do {
		System.out.println("Would" + players + " like to bust or stay?");
		players = scanner.nextLine();
		
		//Bust
		
		if (players.equalsIgnoreCase("Bust")) {
			players.addCard(deck1.dealNextCard());
			System.out.println(players.getHandSum());
				
			if (players.getHandSum() > 21) {
				System.out.println("You busted! You got a total of " + players.getHandSum() + ". Dealer wins!");
		}
			}
		//Stay
		if (players.equalsIgnoreCase("Stay")) {
			System.out.println("You chose to Stay" + players.getHandSum());
		}
		
		}while(players.equalsIgnoreCase("Bust"));

		// Dealer

		do {
			System.out.println("");
			System.out.println("Dealers turn");
			
			// Draw Card
			if(dealer.getHandSum() <= 15) {
				dealer.addCard(deck1.dealNextCard());
				
				if(dealer.getHandSum() == 15) {
					System.out.println("Blackjack! Dealer wins!");
				}
				else {
					System.out.println("Dealer chose to stay");
					int totalDealerSum = dealer.getHandSum();
					int totalPlayerSum = players.getHandSum();
					
					if(totalDealerSum > totalPlayerSum) {
						System.out.println("Both players stayed. The winner is " 
					+ dealer + " with a total of " + totalDealerSum + ".");
					} else {
						System.out.println("Both players stayed. The winner is " 
								+ players + " with a total of " + totalPlayerSum + ".");
					}
				}
			}while
			
			}
		}
}