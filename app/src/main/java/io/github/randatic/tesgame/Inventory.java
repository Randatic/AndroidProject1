package io.github.randatic.tesgame;

import java.util.ArrayList;
/**
 * Created by Randy on 10/3/16.
 */
public class Inventory {

    ArrayList<Item> inventory;
    public Character character;

    public Inventory () {
        inventory = new ArrayList<Item>();
    }

    public int getItemNumber() {return inventory.size();}

    public void addItem(Item i) {
        inventory.add(i);
    }

    public Item getItem(int index) {
        return inventory.get(index);
    }

    public void useItem(Item i)
    {
        if (i.getItemDescription() == "Food")
        {
            character.setHealth(character.getHp() + i.getValue());
            inventory.remove(i);
        }

        else
        {
            character.setAttack(character.getAttack() + i.getValue());
            inventory.remove(i);
        }

    }
    public int hasItem(Item i) {
        for (Item e: inventory) {

        }

        return -1;
    }

    public Item tradeItem(int oldItem, Item newItem) {
        inventory.add(oldItem, newItem);
        return inventory.remove(oldItem+1);
    }

    public void removeItem(int index) {
        inventory.remove(index);
    }

    public void removeItem(Item i) {
        inventory.remove(i);
    }

    public void updateInventory() {
        int[] toRemove = new int[inventory.size()];
        for(int i = inventory.size()-1; i<=0; i--) {
            if (inventory.get(i).getValue()==0) {
                inventory.remove(i);
            }
        }
    }
}
