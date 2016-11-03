package io.github.randatic.tesgame;

/**
 * Created by yohan on 10/5/16.
 */
public class Food extends Item {

    private int affect;

    public Food(String itemName, int value, int affect) {
        super(itemName, value, Item.FOOD);
        this.affect = affect;
    }

    public int getAffect() {
        return affect;
    }
}

