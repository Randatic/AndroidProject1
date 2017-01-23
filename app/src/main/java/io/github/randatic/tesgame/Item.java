package io.github.randatic.tesgame;

public class Item {

    public static final int WEAPON = 0;
    public static final int FOOD = 1;
    public static final int WALLET = 2;

    private String name;
    private int value;
    private int type;

    public Item(String name, int value, int type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    //Modifiers
    public void increaseValue(int n) {
        value += n;
    }
    public void decreaseValue(int n) {
        value -= n;
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
    public int getType() {
        return type;
    }

}
