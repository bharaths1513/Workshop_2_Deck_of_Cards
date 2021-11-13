package WorkShop2_DeckofCards;

public class DeckOfCards {

	String[] Deckofcards = new String[52];

	public void initializingCards() {
		int pos = 0;
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				Deckofcards[pos] = suits[i] + ranks[j];
				pos++;
				System.out.println(Deckofcards[pos] = suits[i] + ranks[j]);
			}
		}
	}

	public static void main(String[] args) {
		DeckOfCards o = new DeckOfCards();
		o.initializingCards();
	}

}
