package cw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import cw.types.CardName; 

public class Creator {
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
    
    // public static Card getCard(CardName name) {

    // }
}
