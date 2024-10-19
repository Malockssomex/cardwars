package cw;

import cw.types.*;

public abstract class Card {
    private CardName id;
    private int manaCost;
    private String name;
    private LandscapeType color;
    private String rulesText;
    private boolean isOwnerPlayer2;
    
    /**
     * 
     * @param id
     * @param manaCost
     * @param name
     * @param color
     * @param rulesText
     * @param isOwnerPlayer2
     */
    public Card(CardName id, int manaCost, String name, LandscapeType color, String rulesText, boolean isOwnerPlayer2) {
        this.id = id;
        this.manaCost = manaCost;
        this.name = name;
        this.color = color;
        this.rulesText = rulesText;
        this.isOwnerPlayer2 = isOwnerPlayer2;
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

    public CardName getId() {
        return id;
    }

    public abstract CardType getType();
}
