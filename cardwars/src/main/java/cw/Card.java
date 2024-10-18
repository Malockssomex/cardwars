package cw;

import cw.types.CardType;
import cw.types.LandscapeType;

public abstract class Card {
    private int manaCost;
    private String name;
    private LandscapeType color;
    private String rulesText;
    private boolean isOwnerPlayer2;
    private CardType type;
    
    public Card(int manaCost, String name, LandscapeType color, String rulesText, boolean isOwnerPlayer2, CardType type) {
        this.manaCost = manaCost;
        this.name = name;
        this.color = color;
        this.rulesText = rulesText;
        this.isOwnerPlayer2 = isOwnerPlayer2;
        this.type = type;
    }

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
