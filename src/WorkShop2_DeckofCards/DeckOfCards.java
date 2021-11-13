package WorkShop2_DeckofCards;

import java.util.ArrayList;

public class DeckOfCards {

	/*
	 * Created a generic type of array list which is accepting only string type
	 */
	ArrayList<String> arrayList = new ArrayList<String>();
	/*
	 * initialized the size of cards .
	 */

	public String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	public String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };

	/*
	 * in this method initializing the suits and ranks
	 */
	public void initilizeCards() {

		int numOfCards = suits.length * ranks.length;
		System.out.println("Number of Cards: " + numOfCards);

		/*
		 * assigning unique ranks to the suits
		 */
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {

				arrayList.add(suits[i]); // adding elements into arraylist
				arrayList.add(ranks[j]);

			}
		}
		toDisplay(arrayList);
	}

	/*
	 * Created a display method to print the array list of Deckofcards. We are using
	 * for-each loop to print all the element of ArrayList.
	 */

	public static void toDisplay(ArrayList<String> arrayList) {
		System.out.println("\nCards in Deck:");
		for (String element : arrayList) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DeckOfCards o = new DeckOfCards();
		o.initilizeCards();
	}
}
