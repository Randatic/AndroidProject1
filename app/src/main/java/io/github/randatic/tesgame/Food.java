package io.github.randatic.tesgame;

/**
 * Created by yohan on 10/5/16.
 */
public class Food extends Item {

    public Food(String itemName, String itemDescription, int value) {
        super(itemName, itemDescription, value);
    }

    public int HealthRecovered() {
        return super.getValue();
    }

}

