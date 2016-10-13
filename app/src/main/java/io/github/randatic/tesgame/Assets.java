package io.github.randatic.tesgame;

/**
 * Created by HP_Win8 on 10/11/2016.
 * This class is just a utility class with static variables (and methods?)
 * Put all icons here as well as anything that will have an ID
 */
public class Assets {


    //Map Directions
    public final static int UP = 0;
    public final static int RIGHT = 1;
    public final static int DOWN = 2;
    public final static int LEFT = 3;

    //Icons
    public final static char UNDISCOVERED = '#';    //0
    public final static char BOUND = '~';           //1
    public final static char NOTHING = '.';         //2

    public final static char PLAYER = '@';          //3
    public final static char MONSTER = 'M';         //4

    public final static char INN = 'I';             //5
    public final static char MERCHANT = '$';        //6

    public static char[] ICONS = {UNDISCOVERED, BOUND, NOTHING, PLAYER, MONSTER, INN, MERCHANT};

    public static char[] PLACES = {INN, MERCHANT};

}