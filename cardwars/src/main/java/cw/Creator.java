package cw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import cw.types.CardName;
import cw.types.LandscapeType; 

public class Creator {
    /**
     * Gets deck from file
     * @param filename - name of file in decks folder
     * @return Returns ArrayList of CardName enums in the deck
     */
    public static ArrayList<CardName> getDeck(String filename) {
        try {
            ArrayList<CardName> result = new ArrayList<CardName>();
            Scanner sc = new Scanner(new File("cardwars\\src\\main\\java\\cw\\decks\\" + filename));
            while (sc.hasNextLine()) {
                result.add(CardName.valueOf(sc.nextLine()));
            }
            sc.close();
            return result;
        } catch (FileNotFoundException e) {
            System.out.println("File not found :( que triste");
            return null;
        }
    }
    
    public static Card getCard(CardName name, boolean isOwnerPlayer2) {
        if (name == CardName.PHYLLIS)
            return (Card)(new Creature(name, 1, "Phyllis", LandscapeType.RAINBOW,  "", isOwnerPlayer2, 2, 7));
        else
            return (Card)(new Creature(name, 1, "Pen", LandscapeType.RAINBOW,  "", isOwnerPlayer2, 2, 7));
    }
}
