package io.github.randatic.tesgame;

public class Wallet extends Item{

    public Wallet(String owner) {
        super((owner + "\'s Wallet"), 0, "wallet");
    }
}
