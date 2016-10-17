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

    public void slime() {
        name = "slime";
        icon = 'S';
        area = "Plains";
        hp = 20;
        atk = 5;
        def = 5;
        spd = 5;
        xp = 10;
    }

    public void wolf() {
        name = "Wolf";
        icon = 'W';
        area = "Plains";
        hp = 25;
        atk = 10;
        def = 5;
        spd = 15;
        xp = 15;
    }

    public void deer() {
        name = "Deer";
        icon = 'D';
        area = "Plains";
        hp = 30;
        atk = 5;
        def = 0;
        spd = 20;
        xp = 5;
    }

    public void plainsSoul(){
        name = "Plain's Soul";
        icon = 'P';
        area = "Plains";
        hp = 200;
        atk = 35;
        def = 50;
        spd = 30;
        xp = 100;
    }

    public void hag(){
        name = "Hag";
        icon = 'H';
        area = "Swamp";
        hp = 50;
        atk = 30;
        def = 20;
        spd = 20;
        xp = 45;
    }

    public void frog(){
        name = "Frog";
        icon = 'F';
        area = "Swamp";
        hp = 30;
        atk = 25;
        def = 20;
        spd = 15;
        xp = 25;
    }

    public void bogMonster(){
        name = "Bog Monster";
        icon = 'B';
        area = "Swamp";
        hp = 65;
        atk = 15;
        def = 30;
        spd = 10;
        xp = 45;
    }

    public void swampSoul(){
        name = "Swamp Soul";
        icon = 'S';
        area = "Swamp";
        hp = 250;
        atk = 40;
        def = 70;
        spd = 40;
        xp = 200;
    }

    public void zombie(){
        name = "Zombie";
        icon = 'Z';
        area = "Gyard";
        hp = 25;
        atk = 30;
        def = 15;
        spd = 10;
        xp = 50;
    }

    public void gRat(){
        name = "Giant Rat";
        icon = 'R';
        area = "Gyard";
        hp = 15;
        atk = 20;
        def = 20;
        spd = 25;
        xp = 60;
    }

    public void necro(){
        name = "Necromancer";
        icon = 'N';
        area = "Gyard";
        hp = 15;
        atk = 40;
        def = 30;
        spd = 20;
        xp = 70;
    }

    public void gysoul(){
        name = "Graveyard Soul";
        icon = 'S';
        area = "Gyard";
        hp = 100;
        atk = 20;
        def = 50;
        spd = 45;
        xp = 90;
    }

    public void elf(){
        name = "Elf";
        icon = 'E';
        area = "Forest";
        hp = 50;
        atk = 30;
        def = 20;
        spd = 50;
        xp = 35;
    }

    public void treant(){
        name = "Treant";
        icon = 'T';
        area = "Forest";
        hp = 60;
        atk = 40;
        def = 60;
        spd = 15;
        xp = 50;
    }

    public void spider(){
        name = "Spider";
        icon = 'S';
        area = "Forest";
        hp = 15;
        atk = 30;
        def = 20;
        spd = 30;
        xp = 15;
    }

    public void fSoul(){
        name = "Forest Soul";
        icon = 'S';
        area = "Forest";
        hp = 120;
        atk = 50;
        def = 75;
        spd = 30;
        xp = 90;
    }

    public void alligator(){
        name = "Alligator";
        icon = 'A';
        area = "River";
        hp = 25;
        atk = 40;
        def = 30;
        spd = 20;
        xp = 90;
    }

    public void pure(){
        name = "Null";
        icon = 'N';
        hp = Integer.MAX_VALUE;
        atk = Integer.MAX_VALUE;
        def = Integer.MAX_VALUE;
        spd = Integer.MAX_VALUE;
        xp = Integer.MAX_VALUE;

    }

}
