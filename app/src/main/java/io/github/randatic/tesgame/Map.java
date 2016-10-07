package io.github.randatic.tesgame;

/**
 * Created by csaper6 on 10/5/16.
 */
public class Map {

    private int[][] playerPosition = {{7}, {7}};


    private String[][] mapGlobalDiscovered = {
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

    private String[][] mapGlobal = {
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
}