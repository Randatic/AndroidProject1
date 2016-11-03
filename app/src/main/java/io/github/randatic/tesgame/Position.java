package io.github.randatic.tesgame;

public class Position {

    private int x, y;
    private int[] pos;
    public Position(int X, int Y) {
        x = X;
        y = Y;
        pos = new int[] {x, y};
    }

    public boolean equalsPos(Position p) {
        if(p.getX()==x&&p.getY()==y)
            return true;
        return false;
    }
    //Setters
    public void setX(int X) {
        x = X;
        pos[0] = x;
    }
    public void setY(int Y) {
        y = Y;
        pos[1] = Y;
    }
    public void setPosArray(int[] position) {
        x = position[0];
        y = position[1];
        pos[0] = x;
        pos[1] = y;
    }

    //Getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int[] getPosArray() {
        return pos;
    }
}