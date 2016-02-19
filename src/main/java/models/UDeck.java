package models;

/**
 * Created by paul on 2/17/16.
 */
/**
 * Edited by Charles on 2/18/16.
 */
public class UDeck extends Deck {

    public void buildDeck() {
        for(int i = 2; i < 15; i++){
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Hearts));
            deck.add(new Card(i,Suit.Diamonds));
            deck.add(new Card(i,Suit.Spades));
        }
    }

}
