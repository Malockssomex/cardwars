package cw;

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

    public void shuffleDeck() {
        
    }
}
