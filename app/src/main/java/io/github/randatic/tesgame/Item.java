package io.github.randatic.tesgame;

public class Item {

    public static final String WEAPON = "weapon";
    public static final String FOOD = "food";
    public static final String WALLET = "wallet";

    private String name;
    private int value;
    private String type;

    public Item(String name, int value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    //Modifiers
    public void increaseValue(int n) {
        value += n;
    }
    public boolean decreaseValue(int n) {
        if(n > value) {
            return false;
        }
        value -= value;
        return true;
    }

    //Setters
    public void setValue(int value) {
        this.value = value;
    }

    //Getters
    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }
    public String getType() {
        return type;
    }

}
