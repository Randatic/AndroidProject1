package io.github.randatic.tesgame;

/**
 * Created by Everyone on 10/7/16.
 */
public class Monster {
    private int atk, def, spd, hp, xp;
    private String name, area;
    private char icon;
    private boolean canFlee;

    public Monster(){

    }

    private void Slime() {
        name = "Slime";
        icon = 'S';
        area = "Plains";
        hp = 10;
        atk = 5;
        def = 5;
        spd = 5;
        xp = 10;
        canFlee = false;
    }

    private void Wolf() {
        name = "Wolf";
        icon = 'W';
        area = "Plains";
        hp = 15;
        atk = 10;
        def = 5;
        spd = 15;
        xp = 15;
        canFlee = false;
    }

    private void Deer() {
        name = "Deer";
        icon = 'D';
        area = "Plains";
        hp = 20;
        atk = 0;
        def = 20;
        spd = 20;
        xp = 20;
        canFlee = true;
    }

}
