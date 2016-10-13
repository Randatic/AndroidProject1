package io.github.randatic.tesgame;

/**
 * Created by Everyone on 10/7/16.
 */
public class Monster {
    private int atk, def, spd, hp, xp;
    private String name, area;
    private char icon;

    public Monster(){

    }

    public void Slime() {
        name = "Slime";
        icon = 'S';
        area = "Plains";
        hp = 20;
        atk = 5;
        def = 5;
        spd = 5;
        xp = 10;
    }

    public void Wolf() {
        name = "Wolf";
        icon = 'W';
        area = "Plains";
        hp = 25;
        atk = 10;
        def = 5;
        spd = 15;
        xp = 15;
    }

    public void Deer() {
        name = "Deer";
        icon = 'D';
        area = "Plains";
        hp = 30;
        atk = 5;
        def = 0;
        spd = 20;
        xp = 5;
    }

    public void PlainsSoul(){
        name = "Plain's Soul";
        icon = 'P';
        area = "Plains";
        hp = 200;
        atk = 35;
        def = 50;
        spd = 30;
        xp = 100;
    }

    private void Hag(){

    }

    public void Null(){
        name = "Null";
        icon = 'N';
        hp = Integer.MAX_VALUE;
        atk = Integer.MAX_VALUE;
        def = Integer.MAX_VALUE;
        spd = Integer.MAX_VALUE;
        xp = Integer.MAX_VALUE;
    }

}
