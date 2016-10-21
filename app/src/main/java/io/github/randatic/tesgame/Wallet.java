package io.github.randatic.tesgame;

/**
 * Created by Yohan on 10/5/16.
 */
public class Wallet extends Item {

    public Wallet(String description, int value) {
        super("Wallet", description, value);
    }

    public int getMoney () {
        return super.getValue();
    }

    public void addMoney(int deposit) {
        super.addToValue(deposit);
    }
    public void subMoney(int remove) {
        super.subFromValue(remove);
    }
}
