package io.github.randatic.tesgame;

/**
 * Created by Ellis on 10/7/2016.
 */
public class Character {
    private int hp, atk, def, spd, xp, maxXp, lvl;
    public Character(){
        hp = 100;
        atk = 10;
        def = 10;
        spd = 10;
        xp = 0;
        maxXp = 50;
        lvl = 1;

        if(xp == maxXp){
            levelUp();
        }
    }

    private void levelUp() {
        lvl = lvl +1;
        hp = hp + 10;
        atk = atk + 2;
        def = def + 2;
        spd = spd + 1;
    }

    public void setAtk(int atk){
        this.atk += atk;
    }

    public void setDef(int def){
        this.def += def;
    }

    public void setSpd(int spd){
        this.spd += spd;
    }





}

