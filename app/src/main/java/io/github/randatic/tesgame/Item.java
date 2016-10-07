package io.github.randatic.tesgame;

/**
 * Created by csaper6 on 10/3/16.
 */
public abstract class Item {
//TODO: create an item abstract class to have subclasses for money, weapons, and food

    public String itemName;
    public int value;
    public int cost;

    public Item(String itemName, int value, int cost)
    {
        this.itemName = itemName;
        this.value = value;
        this.cost = cost;
    }

    public String getItem()
    {
        return itemName.toString();
    }

    public int getValue()
    {
        return value;
    }

    public int getCost()
    {
        return cost;
    }


}
