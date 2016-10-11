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

    private final static char[] LEGEND = {UNDISCOVERED, BOUND, NOTHING};

    private Place[] places;

    private int[][] mapData;
    private char[][] mapGlobal;

    public Map(Place[] places) {
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

        this.places = places;
        updateMap();
    }

    public void movePlayer(int direction) {
        switch (direction) {
            case UP: break;
            case RIGHT: break;
            case DOWN: break;
            case LEFT: break;
        }
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

}