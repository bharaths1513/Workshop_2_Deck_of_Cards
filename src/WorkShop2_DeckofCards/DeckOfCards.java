package WorkShop2_DeckofCards;

import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCards {

	Scanner scanner = new Scanner(System.in);
	public ArrayList<String> cardsDeck = new ArrayList<String>();

// UC1 Initilizing Cards
	public void initializingCards() {

		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };
		int numOfCards = suits.length * ranks.length;
		System.out.println("\nNumber of cards in the deck is : " + numOfCards);

		for (int i = 0; i < ranks.length; i++) {

			for (int j = 0; j < suits.length; j++) {
				cardsDeck.add(ranks[i] + "----->" + suits[j]);
			}
		}
		toDisplay(cardsDeck);
	}

	public static void toDisplay(ArrayList<String> cardsDeck) {
		System.out.println("\nCards in Deck:");
		for (String element : cardsDeck) {
			System.out.println(element);
		}
		System.out.println();
	}

	// UC2 no of players to play min players 2 and max players 4
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

	// UC 3 sequence of the player.

	public void sequenceOfPlay(int player) {
		System.out.println("\nSequence of cards are below : ");
		for (int i = 1; i <= player; i++) {
			System.out.println("\nPlayer " + i + " Getting card.............");

		}
	}

	// UC 4 Shuffling the cards by using Math.random

	public static void toshuffle(ArrayList<String> cardsDeck) {
		System.out.println("shuffling the cards before Distribution");
		ArrayList<String> temp = new ArrayList<String>();
		while (!cardsDeck.isEmpty()) {
			int loc = (int) (Math.random() * cardsDeck.size());
			temp.add(cardsDeck.get(loc));
			cardsDeck.remove(loc);
		}
		cardsDeck = temp;
		toDisplay(cardsDeck);
	}

	// UC 5 Card Distrubution
	public static void cardDistribution(ArrayList<String> cardsDeck, int player) {
		// This loop will itterate for no of players
		for (int i = 0; i < player; i++) {
			System.out.print("\nPlayer " + (i + 1) + " got cards:\n");
			// This loop will itterate for no of cards for each player
			for (int j = 0; j < 9; j++) {
				System.out.print("\t" + cardsDeck.get(i + j * player));
			}
		}
		System.out.println();
	}

}
