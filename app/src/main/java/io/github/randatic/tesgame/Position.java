package io.github.randatic.tesgame;

/**
 * Created by Randy on 10/10/2016.
 */
public class Position {

    private int X;
    private int Y;

    public Position (int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public int[] getPosition() {
        return new int[] {X, Y};
    }

    public void setX(int x) {
        X = x;
    }

    public void setY (int y) {
        Y = y;
    }

    public void setPosition(int[] position) {
        X = position[0];
        Y = position[1];
    }
}