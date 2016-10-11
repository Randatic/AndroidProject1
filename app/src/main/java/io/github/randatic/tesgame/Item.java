package io.github.randatic.tesgame;

/**
 * Created by Yohan on 10/3/16.
 */
public abstract class Item {
    //TODO finish getCost() method

    private String itemName;
    private String itemDescription;

    private int value;

    public Item(String itemName, String itemDescription, int value)
    {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return itemName;
    }

    //Getters
    public String getItemName () {
        return itemName;
    }
    public String getItemDescription() {
        return itemDescription;
    }
    public int getValue()
    {
        return value;
    }

    //unfinished
    public void getCost() {
        //cost will be based on value
        //we will mathematicaly find cost through value
    }

    //Variable Modifiers
    public void addToValue(int n) {
        value += n;
    }
}
