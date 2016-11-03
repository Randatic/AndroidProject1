package io.github.randatic.tesgame;

import java.util.ArrayList;
import java.util.List;

public class Map {

    public static final int NORTH = 0;
    public static final int EAST = 1;
    public static final int SOUTH = 2;
    public static final int WEST = 3;

    public static final char NOTHING = '#';
    public static final char BOUND = '~';

    public static final char[] LEGEND = new char[] {NOTHING, BOUND};

    private Place[] places;
    private List<Character> characters;

    private int[][] mapData;
    private char[][] mapChar;

    public Player player;

    public Map() {
        mapData = new int[][] {
                //0,1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, //0
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, //1
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, //2
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, //3
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, //4
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, //5
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, //6
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, //7
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, //8
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, //9
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, //10
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, //11
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, //12
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, //13
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}  //14
        };

        mapChar = new char[mapData.length][mapData[0].length];

        player = new Player("Human", new Position(7, 7));

        characters = new ArrayList<Character>();
        characters.add(player);
        places = new Place[] {Assets.HULL_HOUSE, Assets.BURNING_FURNACE, Assets.CHARLIES_INN};
        update();
    }

    public void movePlayer(int direction) {
        Position p = player.getPosition();
        if(direction == NORTH) {
            if(p.getY() > 1) {
                player.moveNorth();
            }
        } else if(direction == EAST) {
            if(p.getX() < 13) {
                player.moveEast();
            }
        } else if(direction == SOUTH) {
            if(p.getY() < 13) {
                player.moveSouth();
            }
        } else if(direction == WEST) {
            if(p.getX() > 1) {
                player.moveWest();
            }
        }
    }

    public void update() {
        for(int y = 0; y < mapData.length; y++) {
            for(int x = 0; x <mapData[y].length; x++) {
                mapChar[y][x] = LEGEND[mapData[y][x]];
            }
        }
        for(Place p : places) {
            mapChar[p.getPosition().getY()][p.getPosition().getX()] = p.getIcon();
        }
        for(Character c : characters) {
            mapChar[c.getPosition().getY()][c.getPosition().getX()] = c.getIcon();
        }
    }

    public Place getPlaceAtPlayer() {
        for (Place p : places) {
            if(p.getPosition().equalsPos(player.getPosition())) {
                return p;
            }
        }
        return null;
    }
    public int[][] getMapData() {
        return mapData;
    }
    public char[][] getMap() {
        return mapChar;
    }

}
