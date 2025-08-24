package cw;

import java.util.Random;

import cw.types.CardName;
import java.util.ArrayList;

public class Player {
    private int health;
    private ArrayList<CardName> deck = new ArrayList<CardName>();
    private ArrayList<CardName> hand = new ArrayList<CardName>();
    private ArrayList<CardName> yard = new ArrayList<CardName>();
    
    public Player(ArrayList<CardName> deck) {
        health = 25;
        this.deck = deck;
        hand = new ArrayList<CardName>();
        yard = new ArrayList<CardName>();
    }

    public int getHealth() {
        return health;
    }

    public ArrayList<CardName> getDeck() {
        return deck;
    }

    public ArrayList<CardName> getHand() {
        return hand;
    }

    public ArrayList<CardName> getYard() {
        return yard;
    }

    public void shuffleDeck(Random rng) {
        int size = deck.size();
        for (int i=0; i<size; i++) {
            deck.add(rng.nextInt(size) ,deck.remove(i));
        }
    }

    /**
     * Draws a CardName from the deck into the hand
     */
    public void draw() {
        hand.add(deck.remove(deck.size() - 1));
    }

    /**
     * Draws n CardNames from the deck into the hand
     * @param n - number of CardNames to draw
     */
    public void draw(int n) {
        for (int i=0; i<n; i++)
            draw();
    }

    public void printHand() {
        
    }
}
