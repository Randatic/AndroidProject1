package io.github.randatic.tesgame;

/**
 * Created by Randy on 10/5/16.
 */
public class Map {

    private final static int UP = 0;
    private final static int RIGHT = 1;
    private final static int DOWN = 2;
    private final static int LEFT = 3;

    //  ---|LEGEND|---
    private final static char BOUND = '~';
    private final static char UNDISCOVERED = '#';
    private final static char NOTHING = '.';

    private Character player;
    private final static char[] LEGEND = Assets.ICONS;

    private Place[] places;

    private int[][] mapData;
    private char[][] mapGlobal;

    public Map(Place[] places, Character player) {
        mapData = new int[][] {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        };

        this.player = player;
        this.places = places;
        updateMap();

    }

    public char movePlayer(int direction) {
        if(direction==UP) {
            if(mapData[player.getPosition().getY()+1][player.getPosition().getX()]!=1) {
                player.setPosition(player.getPosition().getY()+1, player.getPosition().getX());
                return placeAt(new Position(player.getPosition().getY()+1, player.getPosition().getX()));
            }
        }
        return NOTHING;
    }

    public void movePlayerUp() {

    }

    public void addMonster(Monster m) {

    }
    public void updateMap() {
        for(int x = 0; x < mapData.length; x++) {
            for(int y = 0; y < mapData[x].length;y++) {
                mapGlobal[x][y] = LEGEND[mapData[x][y]];
            }
        }
    }

    public char placeAt(Position p) {
        return LEGEND[mapData[p.getY()][p.getX()]];
    }
}