package io.github.randatic.tesgame;

import java.util.ArrayList;

/**
 * Created by Ellis on 10/19/2016.
 */
public class Shop extends Assets {
    ArrayList<Weapon> weaponList = new ArrayList<Weapon>(4);
    ArrayList<Weapon> returnList = new ArrayList<Weapon>(4);
    public Shop(){
        fillShop();
    }

    private void fillShop() {
        weaponList.add(BSWORD);
        weaponList.add(SSWORD);
        weaponList.add(MATCHETE);
        weaponList.add(BLKSWORD);
        weaponList.add(WHTSWORD);
        weaponList.add(GUTSWORD);
        weaponList.add(NOVASWORD);
        weaponList.add(SHADESWORD);
    }

    public ArrayList getItems(){
        return weaponList;
    }

}
