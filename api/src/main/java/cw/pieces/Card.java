package cw.pieces;

import cw.types.*;

// Note Cards are only used as Game Objects not as cards in a pile
public abstract class Card {
    private CardName id;
    private int actionCost;
    private String name;
    private LandscapeType color;
    private String rulesText;
    private boolean isOwnerPlayer2;
    
    /**
     *
     * @param id
     * @param actionCost
     * @param name
     * @param color
     * @param rulesText
     * @param isOwnerPlayer2
     */
    public Card(CardName id, int actionCost, String name, LandscapeType color, String rulesText, boolean isOwnerPlayer2) {
        this.id = id;
        this.actionCost = actionCost;
        this.name = name;
        this.color = color;
        this.rulesText = rulesText;
        this.isOwnerPlayer2 = isOwnerPlayer2;
    }

    public int getActionCost() {
        return actionCost;
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
