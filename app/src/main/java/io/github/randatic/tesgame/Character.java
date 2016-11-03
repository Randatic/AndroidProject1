package io.github.randatic.tesgame;
public abstract class Character {

    public static final String PLAYER = "player";
    public static final String MONSTER = "monster";
    public static final String UNKNOWN = "unknown";

    public static final char PLAYER_ICON = '@';
    public static final char MONSTER_ICON = 'Θ';
    public static final char UNKNOWN_ICON = '¿';

    private char icon;
    private String name;
    private String type;
    private Position pos;

    public Character(String name, Position pos, String type) {
        this.name = name;
        this.pos = pos;
        this.type = type;
        setType(type);
    }

    //Movement
    public void moveNorth() {
        pos.setY(pos.getY()-1);
    }
    public void moveEast() {
        pos.setX(pos.getX()+1);
    }
    public void moveSouth() {
        pos.setY(pos.getY()+1);
    }
    public void moveWest() {
        pos.setX(pos.getX()-1);
    }
    public void warpTo(int x, int y) {
        pos.setPosArray(new int[] {x, y});
    }

    //Setters
    public void setPosition(int x, int y) {
        pos.setPosArray(new int[] {x, y});
    }
    private void setType(String type) {
        switch (type) {
            case PLAYER: icon = PLAYER_ICON; this.type = PLAYER; break;
            case MONSTER: icon = MONSTER_ICON; this.type = MONSTER; break;
            default: icon = UNKNOWN_ICON; this.type = UNKNOWN; break;
        }
    }

    //Getters
    public String getName() {
        return name;
    }
    public Position getPosition() {
        return pos;
    }
    public String getType() {
        return type;
    }
    public char getIcon() {
        return icon;
    }
}
