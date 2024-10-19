package cw;

import cw.types.*;

public class Creature extends Card{
    private int atk;
    private int def;
    private int dmg;
    
    /**
     * 
     * @param id
     * @param manaCost
     * @param name
     * @param color
     * @param rulesText
     * @param isOwnerPlayer2
     * @param atk
     * @param def
     */
    public Creature(CardName id, int manaCost, String name, LandscapeType color, String rulesText, boolean isOwnerPlayer2, int atk, int def) {
        super(id, manaCost, name, color, rulesText, isOwnerPlayer2);
        this.atk = atk;
        this.def = def;
        this.dmg = dmg;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getDmg() {
        return dmg;
    }

    public void trigger() {
        
    }
}
