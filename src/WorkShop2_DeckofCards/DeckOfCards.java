package WorkShop2_DeckofCards;

import java.util.Scanner;

public class DeckOfCards {

	Scanner scanner = new Scanner(System.in);
	int pos = 0;

// UC1 Initilizing Cards
	public void initializingCards() {

		String[] Deckofcards = new String[52];
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

	public void noOfPlayers() {
		System.out.print("\nEnter number of players minimum 2 , maximum 4 : ");
		int player = scanner.nextInt();
		if (player >= 2 && player <= 4) {
			System.out.println("\n" + player + " players will play the game");
		} else {
			System.out.println("Please enter number of players in the Range");
			this.noOfPlayers();

		}
	}

	public static void main(String[] args) {
		DeckOfCards o = new DeckOfCards();
		o.initializingCards();
		o.noOfPlayers();
	}

}
