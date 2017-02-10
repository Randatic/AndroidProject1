package io.github.randatic.tesgame;

public class Wallet extends Item{

    private Character owner;

    public Wallet(Character owner) {
        super((owner.getName() + "\'s Wallet"), 0, Item.WALLET);
        this.owner = owner;
    }

    public Character getOwner() {
        return owner;
    }

}
