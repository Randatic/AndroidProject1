package io.github.randatic.tesgame;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ellis on 10/19/2016.
 */
public class Shop extends Assets {
    ArrayList<Weapon> weaponList = new ArrayList<>(4);
    ArrayList<Weapon> returnList = new ArrayList<>(4);
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

    private ArrayList getItems(){
        Random r = new Random();
        for (int i = 0; i > 3; i++)
        {
            returnList.add(weaponList.get(r.nextInt(8)));
        }
        return returnList;
    }
}
