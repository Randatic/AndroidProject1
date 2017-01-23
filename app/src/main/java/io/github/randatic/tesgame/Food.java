package io.github.randatic.tesgame;

/**
 * Created by yohan on 10/5/16.
 */
public class Food extends Item {

    static final String[] AFFECT = {"Increases your health.", };
    private int affect;

    public Food(String itemName, int value, int affect) {
        super(itemName, value, Item.FOOD);
        this.affect = affect;
    }

    public int getAffectCode() {
        return affect;
    }
    public String getAffect() {
        return AFFECT[affect];
    }
}

