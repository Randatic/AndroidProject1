package io.github.randatic.tesgame;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> inventory;

    public Inventory() {
        inventory = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        if (item.getType() == Item.FOOD) {

        }

        inventory.add(item);
    }

    public void updateInventory() {
        for(int i = inventory.size()-1; i>=0; i++) {
            if(inventory.get(i).getValue()==0) {
                inventory.remove(i);
            }
        }
    }

    //Getters
    public Item getItem(int index) {
        return inventory.get(index);
    }
    public Item[] getItemsAsArray() {
        Item[] items = new Item[size()];
        for(int i = 0; i <size(); i++) {
            items[i] = getItem(i);
        }
        return items;
    }
    public String[] getItemsAsStringArray() {
        String[] items = new String[size()];
        for(int i = 0; i < size(); i++) {
            items[i] = getItem(i).getName();
        }
        return items;
    }
    public int size() {
        return inventory.size();
    }

}
