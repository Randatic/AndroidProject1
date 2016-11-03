package io.github.randatic.tesgame;

/**
 * Created by HP_Win8 on 10/11/2016.
 * This class is just a utility class with static variables (and methods?)
 * Put all icons here as well as anything that will have an ID
 */
public class Assets {

    //Places
    public final static Place HULL_HOUSE = new Place("Hull House", "Settlement House", Place.INN, new Position(3, 3));
    public final static Place CHARLIES_INN = new Place("Charlie\'s Inn", "A small traveler's inn.", Place.INN, new Position(10, 6));
    public final static Place BURNING_FURNACE = new Place("The Burning Furnace", "Weapons and Tools Shop", Place.MERCHANT, new Position(5, 11));

    //Food
    public final static Food APPLE = new Food("Apple", 1, 10);
    public final static Food PORTION = new Food("Portion", 1, 30);
    public final static Food LARGE_PORTION = new Food("Large Portion", 1, 25);
    public final static Food HEALTH_POTION = new Food("Health Potion", 1, 50);

    //Weapons
    public final static Weapon BSWORD = new Weapon("Basic Sword", 5, "A simple sword, made of iron.", 1000);
    public final static Weapon SSWORD = new Weapon("Steal Sword", 10, "A sharp sword, made to steel.", 1001);
    public final static Weapon MATCHETE = new Weapon("Machete", 3, "A worn machete.", 1002);
    public final static Weapon BLKSWORD = new Weapon("Black Sword", 15, "A matte black sword", 1003);
    public final static Weapon WHTSWORD = new Weapon("White Sword", 20, "A unnaturally white sword", 1004);
    public final static Weapon GUTSWORD = new Weapon("Guitar Sword", 7, "A sword which is a guitar", 1005);
    public final static Weapon NOVASWORD = new Weapon("Nova Sword", 30, "A sword heated to the temperature of a Nova", 1006);
    public final static Weapon SHADESWORD = new Weapon("Shade Sword", 35, "A sword sword made from shadow", 1007);

    //Arrays
    public static Place[] PLACES = {HULL_HOUSE, CHARLIES_INN, BURNING_FURNACE};
    public static Weapon[] WEAPONS = {BSWORD, SSWORD, MATCHETE, BLKSWORD, WHTSWORD, GUTSWORD, NOVASWORD, SHADESWORD};
}
