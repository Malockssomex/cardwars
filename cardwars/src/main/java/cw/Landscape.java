package cw;

import cw.types.LandscapeType;
//import java.util.ArrayList;

public class Landscape {
    private LandscapeType type;
    private boolean faceUp;
    private boolean isFrozen;
    private Creature creature;
    //private ArrayList<Building>;

    public Landscape(LandscapeType type) {
        this.type = type;
        faceUp = true;
        isFrozen = false;

    }

    public LandscapeType getColor() {
        if (faceUp)
            return type;
        else
            return LandscapeType.RAINBOW;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public Creature getCreature() {
        return creature;
    }    
}
