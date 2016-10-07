package io.github.randatic.tesgame;

/**
 * Created by csaper6 on 10/5/16.
 */
public class Food extends Item {

    public Food(String itemName, int value, int cost) {

        super(itemName, value, cost);
    }


    public int HealthRecover()
    {
        return value;
    }

    public int getCost()
    {
        return cost;
    }


}

