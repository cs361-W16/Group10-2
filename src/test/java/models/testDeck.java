package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paul on 2/17/16.
 */
public class testDeck {
    @Test
    public void testShuffleS(){
        SDeck d = new SDeck();
        d.buildDeck();
        d.shuffle();
        assertNotEquals(2,d.deck.get(0).getValue());
    }

    @Test
    public void testDealS() {
        SDeck d = new SDeck();
        d.buildDeck();
        Card c = d.deal();
        assertEquals("10Swords", c.toString());
    }
}
