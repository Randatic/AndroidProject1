package io.github.randatic.tesgame;

/**
 * Created by HP_Win8 on 10/10/2016.
 */
public class Place {

    private Position position;
    private String name;
    private String description;
    private String type;

    public Place (Position pos, String name, String description, String type) {
        position = pos;
        this.name = name;
        this.description = description;
        this.type = type;
    }
}
