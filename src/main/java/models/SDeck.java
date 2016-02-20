package models;

/**
 * Created by paul on 2/17/16.
 * CODE WRITTEN By Cody 2/18/16.
 */
public class SDeck extends Deck {
	public void buildDeck() {
		for(int i = 1; i <= 10; i++){
			deck.add(new Card(i,Suit.Clubs));
			deck.add(new Card(i,Suit.Cups));
			deck.add(new Card(i,Suit.Coins));
			deck.add(new Card(i,Suit.Swords));
		}
	}
}
