package io.github.randatic.tesgame;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ellis on 10/11/2016.
 */
public class MonsterSpawner extends Monster {
    public Monster[] allMon = new Monster[27];
    public ArrayList<Monster> mtnMon, forestMon, desertMon, swampMon, plainsMon, gyMon, lakeMon, riverMon, beachMon = new ArrayList<>(3);

    public MonsterSpawner(){
        spawnArrayFiller();
        locMonArrayFill();
    }

    private void locMonArrayFill() {
        for(int i = 0; i > allMon.length-1; i++){
            if (allMon[i].getArea().equals("Mountain")){
                mtnMon.add(allMon[i]);
            }
            else if (allMon[i].getArea().equals("Forest")){
                forestMon.add(allMon[i]);
            }
            else if (allMon[i].getArea().equals("Desert")){
                desertMon.add(allMon[i]);
            }
            else if (allMon[i].getArea().equals("Swamp")){
                swampMon.add(allMon[i]);
            }
            else if (allMon[i].getArea().equals("Plains")){
                plainsMon.add(allMon[i]);
            }
            else if (allMon[i].getArea().equals("Gyard")){
                gyMon.add(allMon[i]);
            }
            else if (allMon[i].getArea().equals("Lake")){
                lakeMon.add(allMon[i]);
            }
            else if (allMon[i].getArea().equals("River")){
                riverMon.add(allMon[i]);
            }
            else if (allMon[i].getArea().equals("Beach")){
                beachMon.add(allMon[i]);
            }
        }
    }

    private void spawnArrayFiller() {
        Monster m = new Monster();
        m.deer();
        allMon[0] = m;
        m.slime();
        allMon[1] = m;
        m.wolf();
        allMon[2] = m;
        m.hag();
        allMon[3] = m;
        m.frog();
        allMon[4] = m;
        m.bogMonster();
        allMon[5] = m;
        m.zombie();
        allMon[6] = m;
        m.gRat();
        allMon[7] = m;
        m.necro();
        allMon[8] = m;
        m.elf();
        allMon[9] = m;
        m.treant();
        allMon[10] = m;
        m.spider();
        allMon[11] = m;
        m.alligator();
        allMon[12] = m;
        m.crane();
        allMon[13] = m;
        m.hippo();
        allMon[14] = m;
        m.giant();
        allMon[15] = m;
        m.dragon();
        allMon[16] = m;
        m.golem();
        allMon[17] = m;
        m.scorpion();
        allMon[18] = m;
        m.sphinx();
        allMon[19] = m;
        m.antlion();
        allMon[20] = m;
        m.serpent();
        allMon[21] = m;
        m.sprite();
        allMon[22] = m;
        m.drowned();
        allMon[23] = m;
        m.crab();
        allMon[24] = m;
        m.octopus();
        allMon[25] = m;
        m.shark();
        allMon[26] = m;
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
        Random r = new Random();
        return beachMon.get(r.nextInt(3));
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
