package io.github.randatic.tesgame;

/**
 * Created by csaper6 on 10/5/16.
 */
public class Map {

    String[][] map00;

    String[][] map01;

    String[][] map02;

    String[][] map10;

    String[][] map11;

    String[][] map12;

    String[][] map20;

    String[][] map21;

    String[][] map22;


    String[][] mapGlobalDiscovered = {
            {"~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"~", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "~"},
            {"~", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "~"},
            {"~", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "~"},
            {"~", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "~"},
            {"~", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "~"},
            {"~", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "~"},
            {"~", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "~"},
            {"~", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "~"}, //middle
            {"~", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "~"},
            {"~", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "~"},
            {"~", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "~"},
            {"~", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "~"},
            {"~", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "~"},
            {"~", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "~"},
            {"~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"}
    };

    String[][] mapGlobalUndiscovered = {
            {"~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"},
            {"~", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "~"},
            {"~", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "~"},
            {"~", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "~"},
            {"~", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "~"},
            {"~", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "~"},
            {"~", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "~"},
            {"~", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "~"},
            {"~", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "~"}, //middle
            {"~", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "~"},
            {"~", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "~"},
            {"~", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "~"},
            {"~", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "~"},
            {"~", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "~"},
            {"~", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "~"},
            {"~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~"}

    };

    String[][] mapLocal = {

    };
}