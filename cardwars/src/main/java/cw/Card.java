package cw;

import cw.types.CardType;
import cw.types.LandscapeType;

public abstract class Card {
    private int manaCost;
    private String name;
    private LandscapeType color;
    private String rulesText;
    private boolean isOwnerPlayer2;

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

    public boolean getOwner() {
        return isOwnerPlayer2;
    }
}
