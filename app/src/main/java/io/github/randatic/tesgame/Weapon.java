package io.github.randatic.tesgame;

/**
 * Created by Yohan on 10/5/16.
 */
public class Weapon extends Item{


    public Weapon(String weaponName, String weaponDescription, int value) {
        super(weaponName, weaponDescription, value);
    }

    public int getDamage()
    {
        return super.getValue();
    }

    public int getPrice(){
        return super.getValue()*10;
    }

    public String getName(){
        return super.getItemName();
    }

}
