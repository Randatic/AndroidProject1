package io.github.randatic.tesgame;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ellis on 10/11/2016.
 */
public class MonsterSpawner extends Monster {

    public Monster[] allMon;
    public ArrayList<Monster> mtnMon, forestMon, desertMon, swampMon, plainsMon, gyMon, lakeMon, riverMon, beachMon;

    public MonsterSpawner(){
        allMon = new Monster[27];
        mtnMon = new ArrayList<Monster>(3);
        forestMon = new ArrayList<Monster>(3);
        desertMon = new ArrayList<Monster>(3);
        swampMon = new ArrayList<Monster>(3);
        plainsMon = new ArrayList<Monster>(3);
        gyMon = new ArrayList<Monster>(3);
        lakeMon = new ArrayList<Monster>(3);
        riverMon = new ArrayList<Monster>(3);
        beachMon = new ArrayList<Monster>(3);
        spawnArrayFiller();
        locMonArrayFill();
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
    private void locMonArrayFill() {
        for(int i = 0; i > allMon.length; i++){
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
    private Monster spawnBeachMon() {
        Random r = new Random();
        return beachMon.get(r.nextInt(3));
    }

    private Monster spawnRiverMon() {
        Random r = new Random();
        return riverMon.get(r.nextInt(3));
    }

    private Monster spawnLakeMon() {
        Random r = new Random();
        return lakeMon.get(r.nextInt(3));
    }

    private Monster spawnGraveMon() {
        Random r = new Random();
        return gyMon.get(r.nextInt(3));
    }

    private Monster spawnPlainMon() {
        Random r = new Random();
        return plainsMon.get(r.nextInt(3));
    }

    private Monster SpawnSwampMon() {
        Random r = new Random();
        return swampMon.get(r.nextInt(3));
    }

    private Monster spawnDesertMon() {
        Random r = new Random();
        return desertMon.get(r.nextInt(3));
    }

    private Monster spawnForestMon() {
        Random r = new Random();
        return lakeMon.get(r.nextInt(3));
    }

    private Monster spawnMtnMon() {
        Random r = new Random();
        return mtnMon.get(r.nextInt(3));
    }


    public Monster spawn(int area){
        Monster m = new Monster();
        if (area == 0) {
            m = spawnMtnMon();
        }
        else if(area == 1){
            m = spawnForestMon();
        }
        else if(area == 2){
            m = spawnDesertMon();
        }
        else if(area == 3){
            m = SpawnSwampMon();
        }
        else if(area == 4){
            m = spawnPlainMon();
        }
        else if(area == 5){
            m = spawnGraveMon();
        }
        else if(area == 6){
            m = spawnLakeMon();
        }
        else if(area == 7){
            m = spawnRiverMon();
        }
        else if(area == 8){
            m = spawnBeachMon();
        }
        else {
           m.pure();
        }
        return m;
    }


}
