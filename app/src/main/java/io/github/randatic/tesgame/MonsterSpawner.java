package io.github.randatic.tesgame;

/**
 * Created by Ellis on 10/11/2016.
 */
public class MonsterSpawner extends Monster {

    Monster m;

    public MonsterSpawner(){
         m = new Monster();
        spawnArrayFiller();
    }

    private void spawnArrayFiller() {
    }

    public Monster spawn(int area){

        if (area == 1) {
            m = spawnMtnMon();
        }
        else if(area == 2){
            m = spawnForestMon();
        }
        else if(area == 3){
            m = spawnDesertMon();
        }
        else if(area == 4){
            m = SpawnSwampMon();
        }
        else if(area == 5){
            m = spawnPlainMon();
        }
        else if(area == 6){
            m = spawnGraveMon();
        }
        else if(area == 7){
            m = spawnLakeMon();
        }
        else if(area == 8){
            m = spawnRiverMon();
        }
        else if(area == 9){
            m = spawnBeachMon();
        }
        else {
            m.Null();
        }
        return m;
    }

    private Monster spawnBeachMon() {
        return null;
    }

    private Monster spawnRiverMon() {
        return null;
    }

    private Monster spawnLakeMon() {
        return null;
    }

    private Monster spawnGraveMon() {
        return null;
    }

    private Monster spawnPlainMon() {
        return null;
    }

    private Monster SpawnSwampMon() {
        return null;
    }

    private Monster spawnDesertMon() {
        return null;
    }

    private Monster spawnForestMon() {
        return null;
    }

    private Monster spawnMtnMon() {
        return null;
    }
}
