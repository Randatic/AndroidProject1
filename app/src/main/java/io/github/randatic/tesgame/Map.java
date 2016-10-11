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
    private final static String PLAYER = "@";
    private final static String INN = "I";
    private final static String BOUND = "~";
    private final static String UNDISCOVERED = "#";
    private final static String NOTHING = ".";
    private final static String ENEMY = "E";

    private final static String[] LEGEND = {UNDISCOVERED, BOUND, NOTHING, INN, PLAYER, ENEMY};

    private int[][] mapData;
    private String[][] mapGlobal;

    public Map() {
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

    public void updateMap() {
        for(int x = 0; x < mapData.length; x++) {
            for(int y = 0; y < mapData[x].length;y++) {
                mapGlobal[x][y] = LEGEND[mapData[x][y]];
            }
        }
    }

}