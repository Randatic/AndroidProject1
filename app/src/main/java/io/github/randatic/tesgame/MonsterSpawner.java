package io.github.randatic.tesgame;

/**
 * Created by Ellis on 10/11/2016.
 */
public class MonsterSpawner extends Monster {

    public static final int MOUNTAIN = 1;

    public MonsterSpawner(){

    }

    public Monster Spawn(int area){
        Monster m = new Monster();
        if (area == 1) {
            m = SpawnMtnMon();
        }
        else if(area == 2){
            m = SpawnForestMon();
        }
        else if(area == 3){
            m = SpawnDesertMon();
        }
        else if(area == 4){
            m = SpawnSwampMon();
        }
        else if(area == 5){
            m = SpawnPlainMon();
        }
        else if(area == 6){
            m = SpawnGraveMon();
        }
        else if(area == 7){
            m = SpawnLakeMon();
        }
        else if(area == 8){
            m = SpawnRiverMon();
        }
        else if(area == 9){
            m = SpawnBeachMon();
        }
        else {
            m.Null();
        }
        return m;
    }

    private Monster SpawnBeachMon() {

        return null;
    }

    private Monster SpawnRiverMon() {
        return null;
    }

    private Monster SpawnLakeMon() {
        return null;
    }

    private Monster SpawnGraveMon() {
        return null;
    }

    private Monster SpawnPlainMon() {
        return null;
    }

    private Monster SpawnSwampMon() {
        return null;
    }

    private Monster SpawnDesertMon() {
        return null;
    }

    private Monster SpawnForestMon() {
        return null;
    }

    private Monster SpawnMtnMon() {
        return null;
    }
}
