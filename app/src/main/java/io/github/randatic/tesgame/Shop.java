package io.github.randatic.tesgame;

import java.util.ArrayList;

/**
 * Created by Ellis on 10/19/2016.
 */
public class Shop extends Assets {
    ArrayList<Weapon> weaponList = new ArrayList<>(4);
    public Shop(){
        fillShop();

    }

    private void fillShop() {
        weaponList.add(BSWORD);
        weaponList.add(SSWORD);
        weaponList.add(MATCHETE);
        weaponList.add(BLKSWORD);
        weaponList.add(WHTSWORD);
    }

    private ArrayList getItems(){
        return null;
    }
}
