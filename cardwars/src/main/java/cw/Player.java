package cw;

import java.util.Random;
import java.util.ArrayList;

public class Player {
    private int health;
    ArrayList<Card> deck = new ArrayList<Card>();
    ArrayList<Card> hand = new ArrayList<Card>();
    ArrayList<Card> yard = new ArrayList<Card>();
    
    public Player(ArrayList<Card> deck) {
        health = 25;
        this.deck = deck;
    }

    public int getHealth() {
        return health;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public ArrayList<Card> getYard() {
        return yard;
    }

    public void shuffleDeck(Random rng) {
        int size = deck.size();
        for (int i=0; i<size; i++) {
            deck.add(rng.nextInt(size) ,deck.remove(i));
        }
    }

    /**
     * Draws a card from the deck into the hand
     */
    public void draw() {
        hand.add(deck.remove(deck.size() - 1));
    }

    /**
     * Draws n cards from the deck into the hand
     * @param n - number of cards to draw
     */
    public void draw(int n) {
        for (int i=0; i<n; i++)
            draw();
    }
}
