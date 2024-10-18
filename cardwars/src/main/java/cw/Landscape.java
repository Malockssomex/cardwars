package cw;

public class Landscape {
    private LandscapeType type;
    private boolean faceUp;

    public Landscape(LandscapeType type, boolean faceUp) {
        this.type = type;
        this.faceUp = faceUp;
    }

    public LandscapeType getType() {
        return type;
    }

    public boolean isFaceUp() {
        return faceUp;
    }
}
