package cw;

import java.util.Random;
import java.util.Scanner;

import cw.pieces.*;
import cw.types.*;

public class Main {
    static boolean isPlayer2Turn = false;
    static boolean isTurnZero = true;
    static Scanner sc = new Scanner(System.in);
    static Player currentPlayer, opposingPlayer;
    static Landscape[][] board = new Landscape[2][4];
    static int actions, storm, creatureStorm;
    static int winner = 0;

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
        int cost = card.getActionCost();
        int colorAction = actionsOfColor(card.getColor());
        if (actions < cost)
            return false;
        if (colorAction < 2 && colorAction < cost) // (colorAction < 2) is a unofficial rule change
            return false;
        // if (false) // for addition costs later
        //     return false;
        return true;
    }

    private static int actionsOfColor(LandscapeType color) {
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

    public static void main(String[] args) {
        System.out.print("Enter Seed: ");
        Random rng = new Random(sc.nextLong());

        System.out.print("Enter Player 1's Deck File: ");
        currentPlayer = new Player(Creator.getDeck(sc.next()));
        System.out.print("Enter Player 2's Deck File: ");
        opposingPlayer = new Player(Creator.getDeck(sc.next()));

        // Create landscapes

        currentPlayer.shuffleDeck(rng);
        opposingPlayer.shuffleDeck(rng);
        currentPlayer.draw(5);
        opposingPlayer.draw(5);

        while(winner == 0) {
            storm = 0;
            creatureStorm = 0;
            actions = 2;
            currentPlayer.draw();
            
            // Main Phase
            System.out.print("# ");
            String tokens[] = sc.nextLine().split(" ");
            while(tokens[0] != "attack") {
                switch(tokens[0]) {
                    case "ls":
                        break;
                    case "draw":
                        if (actions > 0) {
                            currentPlayer.draw();
                        } else {
                            System.out.println("draw: No actions left.");
                        }
                        break;
                    case "floop":
                        //if ()    
                    break;
                }

                if (winner != 0) {
                    break;
                }

                System.out.print("# ");
                tokens = sc.nextLine().split(" ");
            }
            if (winner != 0) {
                break;
            }

            // Fight Phase


            // Switches turns
            isTurnZero = false;
            Player tempPlayer = currentPlayer;
            currentPlayer = opposingPlayer;
            opposingPlayer = tempPlayer;
            isPlayer2Turn = !isPlayer2Turn;
        }

        // First XOR used :)
        if (winner < 0 ^ isPlayer2Turn) {
            System.out.println("Player 1 Won!");
        } else {
            System.out.println("Player 2 Won!");
        }

        sc.close();
    }
}