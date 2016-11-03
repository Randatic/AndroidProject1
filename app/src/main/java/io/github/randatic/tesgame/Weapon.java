package io.github.randatic.tesgame;

/**
 * Created by Yohan on 10/5/16.
 */
public class Weapon extends Item{

    private String description;

    public Weapon(String weaponName, int value, String description) {
        super(weaponName, value, Item.WEAPON);
        this.description = description;
    }
}
