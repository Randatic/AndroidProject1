package io.github.randatic.tesgame;

/**
 * Created by Ellis on 10/11/2016.
 */
public class MonsterSpawner extends Monster {
    public Monster[] allMon = new Monster[37];

    public MonsterSpawner(){
        spawnArrayFiller();
        locMonArrayFill();
    }

    private void locMonArrayFill() {
    }

    private void spawnArrayFiller() {
        Monster m = new Monster();
        m.deer();
        allMon[0] = m;
        m.slime();
        allMon[1] = m;
        m.wolf();
        allMon[2] = m;
        m.plainsSoul();
        allMon[3] = m;
        m.hag();
        allMon[4] = m;
        m.frog();
        allMon[5] = m;
        m.bogMonster();
        allMon[6] = m;
        m.swampSoul();
        allMon[7] = m;
        m.zombie();
        allMon[8] = m;
        m.gRat();
        allMon[9] = m;
        m.necro();
        allMon[10] = m;
        m.gysoul();
        allMon[11] = m;
    }

    public Monster spawn(int area){
        Monster m = new Monster();
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
           m.pure();
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
