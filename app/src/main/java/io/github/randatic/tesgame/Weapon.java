package io.github.randatic.tesgame;

/**
 * Created by Yohan on 10/5/16.
 */
public class Weapon extends Item{


    public Weapon(String itemName, int value, int cost) {
        super(itemName, value, cost);
    }

    public int damage()
    {
        return value;
    }

    public int getCost()
    {
        return cost;
    }


}
