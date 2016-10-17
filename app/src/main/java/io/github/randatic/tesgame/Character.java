package io.github.randatic.tesgame;

/**
 * Created by Ellis on 10/7/2016.
 */
public class Character {

    private int hp, atk, def, spd, xp, maxXp, lvl;
    private String name;

    private Inventory inv;
    private Position pos;

    public Character(){
        hp = 100;
        atk = 10;
        def = 10;
        spd = 10;
        xp = 0;
        maxXp = 50;
        lvl = 1;
        pos = new Position(7, 7);
        inv = new Inventory();

    }

    private void levelUp() {
        xp = xp - maxXp;
        maxXp += maxXp/2;
        lvl = lvl +1;
        hp = hp + 10;
        atk = atk + 2;
        def = def + 2;
        spd = spd + 1;
    }

    //what is going on
    //Setters
    public void setAttack(int atk){
        this.atk = atk;
    }
    public void setDefence(int def){
        this.def = def;
    }
    public void setSpeed(int spd){
        this.spd = spd;
    }
    public void setPosition(int X, int Y) {
        pos.setPosition(new int[]{X, Y});
    }
        public void setHealth (int hp)
    {
        this.hp = hp;
    }


    //Getters
    public int getAttack() {
        return atk;
    }
    public int getDefence() {
        return def;
    }
    public int getSpeed() {
        return spd;
    }
    public int getHp() {
        return hp;
    }
    public int getXp() {
        return xp;
    }
    public int getMaxXp() {
        return maxXp;
    }
    public int getLevel() {
        return lvl;
    }
    public Position getPosition() {
        return pos;
    }
    public int[] getPositionAsArray() {
        return pos.getPosition();
    }
    public String getName() {return name;}
}

