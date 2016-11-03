package io.github.randatic.tesgame;

public class Place {

    public static final char MERCHANT_ICON = '$';
    public static final char INN_ICON = 'I';
    public static final char UNKNOWN_ICON = '?';

    public static final String MERCHANT = "merchant";
    public static final String INN = "inn";
    public static final String UNKNOWN = "unknown";

    private char icon;
    private String name;
    private String description;
    private String type;
    private Position position;

    public Place(String name, String description, String type, Position position) {
        this.name = name;
        this.description = description;
        this.position = position;
        setType(type);
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getType() {
        return type;
    }
    public Position getPosition() {
        return position;
    }
    public char getIcon() {
        return icon;
    }

    //Setters
    private void setType(String type) {
        switch (type) {
            case MERCHANT: icon = MERCHANT_ICON; this.type = MERCHANT; break;
            case INN: icon = INN_ICON; this.type = INN; break;
            default: icon = UNKNOWN_ICON; this.type = UNKNOWN; break;
        }
    }
}