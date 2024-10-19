package cw;

import java.util.Random;
import java.util.Scanner;
import cw.types.*;

public class Game {
    static boolean isPlayer2Turn = false;
    static boolean isTurnZero = true;
    static char key;
    static Scanner sc = new Scanner(System.in);
    static Player cp, op, tp;
    static Landscape[][] board = new Landscape[2][4];
    static int mana, storm, creatureStorm;

    public static void run() {
        System.out.print("Enter Seed: ");
        Random rng = new Random(sc.nextLong());
        System.out.print("Enter Player 1's Deck File: ");
        cp = new Player(Creator.getDeck(sc.next()));
        System.out.print("Enter Player 2's Deck File: ");
        op = new Player(Creator.getDeck(sc.next()));
        // Create landscapes
        cp.shuffleDeck(rng);
        op.shuffleDeck(rng);
        cp.draw(5);
        op.draw(5);

        while(key != '}') {
            storm = 0;
            creatureStorm = 0;
            mana = 2;
            
            isTurnZero = false;
            isPlayer2Turn = !isPlayer2Turn;
        }
        sc.close();
    }

    // private static boolean boolInput(String prompt) {
    //     key = '%';
    //     while (key != '~') {
    //         System.out.println(prompt);
    //         String response = sc.next();
    //         if (response.length() == 1) {
    //             key = response.charAt(0);
    //             if (key == '?') {
    //                 System.out.println("all the codes");
    //             } else if (key == 'h') {

    //             } else if (key == 'g') {

    //             } else if (key == 'c') {

    //             } else if (key == 'l') {

    //             } else if (key == 'b') {

    //             } else if (key == 't') {
    //                 System.out.println();

    //             } else if (key == 'n' || key == 'a')
    //                 return false;
    //         }
    //     }
    // }

    private static void play(Card card) {
        if (canPlay(card)) {
            CardType type = card.getType();
            if (type == CardType.CREATURE) {
                
            } else if (type == CardType.SPELL) {
                
            } else if (type == CardType.BUILDING) {
                
            }
        }
    }

    private static boolean canPlay(Card card) {;
        int cost = card.getManaCost();
        int colorMana = manaOfColor(card.getColor());
        if (mana < cost)
            return false;
        if (colorMana < 2 && colorMana < cost) // (colorMana < 2) is a unoffical rule change
            return false;
        if (false) // for addition costs later
            return false;
        return true;
    }

    private static int manaOfColor(LandscapeType color) {
        int count = 0;
        if (color == LandscapeType.RAINBOW) {
            for (Landscape land : board[0]) {
                if (land.getColor() != color)
                    count++;
            }
            return count;
        } else {
            for (Landscape land : board[0]) {
                if (land.getColor() == color)
                    count++;
            }
            return count;
        }
    }
}
