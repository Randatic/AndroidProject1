package io.github.randatic.tesgame;

/**
 * Created by csaper6 on 10/17/16.
 */
public class Game {
    private Map map;
    private Character player;

    public Game () {
        player = new Character();
        map = new Map(player);
    }

    public Character getPlayer() {
        return player;
    }
    public Map getMap() {
        return map;
    }

}
