package cw;

import java.util.ArrayList;
import cw.types.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<CardName> deck = Creator.getDeck("deck.txt");
        deck.forEach( (n) -> { System.out.println(n); } );
        //Game.run();
    }
}