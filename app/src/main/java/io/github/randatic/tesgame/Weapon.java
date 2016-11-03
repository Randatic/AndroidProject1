package io.github.randatic.tesgame;

/**
 * Created by Yohan on 10/5/16.
 */
public class Weapon extends Item{

    private String description;
    private int id;

    public Weapon(String weaponName, int value, String description, int id) {
        super(weaponName, value, Item.WEAPON);
        this.description = description;
        this.id =id;
    }

    public int getID() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
