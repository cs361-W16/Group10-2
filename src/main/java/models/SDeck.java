package models;

/**
 * Created by paul on 2/17/16.
 */
public class SDeck extends Deck {

    public void buildDeck() {  //remove: just for testing Udeck
        for(int i = 2; i < 15; i++){
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Hearts));
            deck.add(new Card(i,Suit.Diamonds));
            deck.add(new Card(i,Suit.Spades));
        }
    }
}

