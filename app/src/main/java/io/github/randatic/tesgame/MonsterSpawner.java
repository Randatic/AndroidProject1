package io.github.randatic.tesgame;

/**
 * Created by Ellis on 10/11/2016.
 */
public class MonsterSpawner extends Monster {
    public MonsterSpawner(){

    }

    private void Spawn(int area){
        if (area == 1) {
            SpawnMtnMon();
        }
        else if(area == 2){
            SpawnForestMon();
        }
        else if(area == 3){
            SpawnDesertMon();
        }
        else if(area == 4){
            SpawnSwampMon();
        }
        else if(area == 5){
            SpawnPlainMon();
        }
        else if(area == 6){
            SpawnGraveMon();
        }
        else if(area == 7){
            SpawnLakeMon();
        }
        else if(area == 8){
            SpawnRiverMon();
        }
        else if(area == 9){
            SpawnBeachMon();
        }
        else {
            return Null();
        }
    }

    private void SpawnBeachMon() {
    }

    private void SpawnRiverMon() {
    }

    private void SpawnLakeMon() {
    }

    private void SpawnGraveMon() {
    }

    private void SpawnPlainMon() {
    }

    private void SpawnSwampMon() {
    }

    private void SpawnDesertMon() {
    }

    private void SpawnForestMon() {
    }

    private void SpawnMtnMon() {
    }
}
