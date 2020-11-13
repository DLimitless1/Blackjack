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
	public final Player player = new Player();
	public final Player dealer = new Player();
	public Card dealNextCard();
			
	Scanner scanner = new Scanner(System.in);
	String player = scanner.nextLine();
	player = scanner.nextLine();
	
	if (player.equalsIgnoreCase("Yes")) {
		Deck deck1 = new Deck();
		Card card = new Card();
		deck1.shuffleDeck();
		System.out.println("Shuffel Deck");	
	
	// Deal
		//Round 1
		player.addCard(deck1.dealNextCard());
		
		//Round 2
		player.addCard(deck1.dealNextCard());
		
		player.getPlayerHand(true);
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
		System.out.println("Would" + player + " like to bust or stay?");
		player = scanner.nextLine();
		
		//Bust
		
		if (player.equalsIgnoreCase("Bust")) {
			player.addCard(deck1.dealNextCard());
			System.out.println(player.getHandSum());
				
			if (player.getHandSum() > 21) {
				System.out.println("You busted! You got a total of " + player.getHandSum() + ". Dealer wins!");
		}
			}
		//Stay
		if (player.equalsIgnoreCase("Stay")) {
			System.out.println("You chose to Stay" + player.getHandSum());
		}
		
		}while(player.equalsIgnoreCase("Bust"));

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