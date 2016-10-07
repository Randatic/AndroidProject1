package io.github.randatic.tesgame;

/**
 * Created by csaper6 on 10/5/16.
 */
public class Wallet extends Item {

    public Wallet(String itemName, int value, int cost) {
        super(itemName, value, cost);
    }

    public int getMoney ()
    {
        return value;
    }
}
