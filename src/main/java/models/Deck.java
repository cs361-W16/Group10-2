package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by paul on 2/17/16.
 */
public abstract class Deck {

    public java.util.List<Card> deck = new ArrayList<>();

    public abstract void buildDeck();

    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
    }

    public Card deal() {
        Card c = deck.get(deck.size()-1);
        deck.remove(deck.size()-1);
        return c;
    }
}
