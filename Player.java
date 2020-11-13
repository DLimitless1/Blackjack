import java.util.ArrayList;

public class Player {

	private String player;
	private int playerNumOfCards;
	ArrayList<Card> playerHand;
	
	public Player() {
		this.player = player;
		playerHand = new ArrayList<Card>();
	}
	public String getPlayer() {
		return player;
	}
	
// New card
	public void dealCard(Card dealCard) {
		playerHand.add(dealCard);
		this.playerNumOfCards++;
	}
	public int getHandSum() {
		int Sum = 0;
		for(Card countSum: playerHand) {
			Sum = Sum + countSum.numValue();
		}
		return Sum;
	}
	
//See players hand
	public void getPlayerHand (boolean hideCard) {
		System.out.println(this.player + "h current hand.");
		
		for (int h = 0; h < playerNumOfCards; h++) {
			if(h == 0 && !hideCard) {
				System.out.println("[Hidden Cards]");
			}else {
				System.out.println(playerHand.get(h).toString());
			}
		}
	}
}
