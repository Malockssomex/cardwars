package cw;

import cw.types.CardType;
import cw.types.LandscapeType;

public class Card {
    private int manaCost;
    private String name;
    private LandscapeType color;
    private String rulesText;
    private CardType type;

    public int getManaCost() {
        return manaCost;
    }

    public String getName() {
        return name;
    }

    public LandscapeType getColor() {
        return color;
    }
    
    public String getRulesText() {
        return rulesText;
    }
}
