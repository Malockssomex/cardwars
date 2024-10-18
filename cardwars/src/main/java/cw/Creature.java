package cw;

import cw.types.CardType;
import cw.types.LandscapeType;

public class Creature extends Card{
    private int atk;
    private int def;
    private int dmg;

    public Creature(int manaCost, String name, LandscapeType color, String rulesText, boolean isOwnerPlayer2, int atk, int def, int dmg) {
        super(manaCost, name, color, rulesText, isOwnerPlayer2, CardType.CREATURE);
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

    
}
