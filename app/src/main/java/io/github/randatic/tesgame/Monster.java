package io.github.randatic.tesgame;

/**
 * Created by Everyone on 10/7/16.
 */
public class Monster {
    private int atk, def, spd, hp;
    private String name;

    public Monster(int area){
        if (area == 5){
            spawnSlime();
        }
    }

    private void spawnSlime() {
        name = "Slime";
        hp = 10;
        atk = 5;
        def = 5;
        spd = 5;
    }

}
