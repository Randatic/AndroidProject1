package io.github.randatic.tesgame;

/**
 * Created by HP_Win8 on 10/10/2016.
 */
public class Place {

    private Position position;
    private String name;
    private String description;
    private char icon;

    public Place (Position pos, String name, String description, char icon) {
        position = pos;
        this.name = name;
        this.description = description;
        this.icon = icon;
    }

    //Getters
    public Position getPosition() {
        return position;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public char getIcon() {
        return icon;
    }
}
