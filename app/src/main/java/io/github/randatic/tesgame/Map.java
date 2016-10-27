package io.github.randatic.tesgame;

import java.util.Random;

/**
 * Created by Randy on 10/5/16.
 */
public class Map {

    public final static int UP = 0;
    public final static int RIGHT = 1;
    public final static int DOWN = 2;
    public final static int LEFT = 3;

    //  ---|LEGEND|---
    private final static char BOUND = '~';
    private final static char UNDISCOVERED = '#';
    private final static char NOTHING = '.';

    //Variables
    private final static char[] LEGEND = Assets.ICONS;

    private int[][] mapData;
    private char[][] mapGlobal;

    private MonsterSpawner monsterSpawner;

    public Map(Character player) {
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

        mapGlobal = new char[mapData.length][mapData[0].length];
        updateMap(player);

    }

    public char movePlayer(int direction, Character player) {
        if(direction==UP) {
            if(mapData[player.getPosition().getY()-1][player.getPosition().getX()]!=1) {
                player.setPosition(player.getPosition().getX(), player.getPosition().getY()-1);
            }
        } else if(direction==RIGHT) {
            if(mapData[player.getPosition().getY()][player.getPosition().getX()+1]!=1) {
                player.setPosition(player.getPosition().getX()+1, player.getPosition().getY());
            }
        } else if(direction==DOWN) {
            if(mapData[player.getPosition().getY()+1][player.getPosition().getX()]!=1) {
                player.setPosition(player.getPosition().getX(), player.getPosition().getY()+1);
            }
        } else if(direction==LEFT) {
            if(mapData[player.getPosition().getY()][player.getPosition().getX()-1]!=1) {
                player.setPosition(player.getPosition().getX()-1, player.getPosition().getY());
            }
        }

        updateMap(player);
        return placeAt(new Position(player.getPosition().getX(), player.getPosition().getY()));

    }

    public void addMonster(MonsterSpawner m) {

        Random random = new Random();
        monsterSpawner = m;
        monsterSpawner.spawn(random.nextInt(9));

    }
    public void updateMap(Character player) {
        for(int y = 0; y < mapData.length; y++) {
            for(int x = 0; x < mapData[y].length;x++) {
                mapGlobal[y][x] = LEGEND[mapData[y][x]];
            }
        }

        for(Place p : Assets.PLACES) {
           mapGlobal[p.getPosition().getY()][p.getPosition().getX()] = p.getIcon();
        }
        mapGlobal[player.getPosition().getY()][player.getPosition().getX()] = LEGEND[3];
    }

    public char placeAt(Position p) {
        return LEGEND[mapData[p.getY()][p.getX()]];
    }

    public char[][] getMap() {
        return mapGlobal;
    }
    public int[][] getMapDat() { return mapData; }
}