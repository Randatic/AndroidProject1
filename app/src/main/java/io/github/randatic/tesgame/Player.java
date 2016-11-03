package io.github.randatic.tesgame;

public class Player extends Character{

    private Wallet wallet;
    private Inventory inv;

    private int hp, maxHp, xp, maxXp, lvl, atk, def;

    public Player(String name, Position pos) {
        super(name, pos, Character.PLAYER);
        wallet = new Wallet(super.getName());
        inv = new Inventory();
        hp = 100;
        maxHp = 100;
        xp = 0;
        maxXp = 20;
        lvl = 1;
        atk = 10;
        def = 15;
        wallet.increaseValue(20);
    }
    public void getItem(Item e) {
        inv.addItem(e);
    }

    //Misc
    public boolean isDead() {
        return (hp<=0);
    }
    public boolean canLvlUp() {
        if(xp >= maxXp) {
            return true;
        }
        return false;
    }
    public void lvlUp() {
        if(canLvlUp()) {
            xp = maxXp - xp;
            maxXp *= 1.5;
            resetHp();
            maxHp *= 1.5;
            atk *= 1.5;
            def *= 1.5;
            lvl++;
            if (canLvlUp())
                lvlUp();
        }
    }
    public void resetHp() {
        hp = maxHp;
    }
    public void takeDamage(int damage) {
        if(damage > def)
            hp -= (damage-def);
    }
    public void heal(int health) {
        hp += health;
        if(hp > maxHp)
            resetHp();
    }
    public void consume(Food f) {

    }

    public void decreaseMoney(int i ) {
        wallet.decreaseValue(i);
    }

    public void increaseMoney(int i ) {
        wallet.increaseValue(i);
    }

    //getters
    public Inventory getInventory() {return inv;}
    public Wallet getWallet() {return wallet;}
    public int getHp() {return hp;}
    public int getMaxHp() {return maxHp;}
    public int getXp() {return xp;}
    public int getMaxXp() {return maxXp;}
    public int getLvl() {return lvl;}
    public int getAtk() {return atk;}
    public int getDef() {return def;}
    public String[] getStatsStringArray() {
        return new String[] {"" + hp + "/" + maxHp, "" + xp + "/" + maxXp, "" + lvl, "" + atk, "" + def};
    }
    public String[] getStatsFormattedStringArray() {
        return new String[] {"HP:\t" + hp + "/" + maxHp, "XP:\t" + xp + "/" + maxXp, "Lvl:\t" + lvl, "Atk:\t" + atk, "Def:\t" + def};
    }

}
