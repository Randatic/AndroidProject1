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
                player.setPosition(player.getPosition().getX(), player.getPosition().getY()+1);
                return placeAt(new Position(player.getPosition().getX(), player.getPosition().getY()));
            }
        } else if(direction==RIGHT) {
            if(mapData[player.getPosition().getY()][player.getPosition().getX()+1]!=1) {
                player.setPosition(player.getPosition().getX()+1, player.getPosition().getY());
                return placeAt(new Position(player.getPosition().getX(), player.getPosition().getY()));
            }
        } else if(direction==DOWN) {
            if(mapData[player.getPosition().getY()-1][player.getPosition().getX()]!=1) {
                player.setPosition(player.getPosition().getX(), player.getPosition().getY()-1);
                return placeAt(new Position(player.getPosition().getX(), player.getPosition().getY()));
            }
        } else if(direction==LEFT) {
            if(mapData[player.getPosition().getY()][player.getPosition().getX()-1]!=1) {
                player.setPosition(player.getPosition().getX()-1, player.getPosition().getY());
                return placeAt(new Position(player.getPosition().getX(), player.getPosition().getY()));
            }
        }

        return placeAt(new Position(player.getPosition().getX(), player.getPosition().getY()));
    }

    public void addMonster(Monster m) {

    }
    public void updateMap() {
        for(int x = 0; x < mapData.length; x++) {
            for(int y = 0; y < mapData[x].length;y++) {
                mapGlobal[x][y] = LEGEND[mapData[x][y]];
            }
        }

        mapGlobal[player.getPosition().getY()][player.getPosition().getY()] = LEGEND[3];
    }

    public char placeAt(Position p) {
        return LEGEND[mapData[p.getY()][p.getX()]];
    }

    public char[][] getMap() {
        return mapGlobal;
    }
    public int[][] getMapDat() { return mapData; }
}