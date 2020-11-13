import java.util.ArrayList;
import java.util.Arrays;

public class Card {

// Attributes, this is where I set the actual indiv. value for each card
	String suit;
	Values value;

	// These are the card options
	public final static String[] suits = {"Heart", "Spade", "Diamond", "Clubs" };
	public final static String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
			"King"};

	// Enum as an attribute of cards
	public static enum Values {
		Ace(1), two(2), three(3), four(4), five(5), six(6), seven(7), eight(8), nine(9), ten(10), Jack(10), Queen(10),
		King(10);

		private int numValue;

		Values(int numValue) {
			this.numValue = numValue;
			System.out.println("Card");
		
		}
		public int getNumValue() {
			return numValue;
		}
	}

	public Card(String suit, Values value) {
		this.suit = suit;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", value=" + value + "]\n";
	}
}