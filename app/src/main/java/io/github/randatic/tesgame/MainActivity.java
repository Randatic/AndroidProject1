package io.github.randatic.tesgame;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMap;
    private Map map;
    private Place[] places;
    private Character character;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        places = new Place[] {};
        character = new Character();

        tvMap = (TextView) findViewById(R.id.textViewMap);
        tvMap.setTypeface(Typeface.MONOSPACE); //makes characters the same size

        map = new Map(places, character);
        displayMap();
    }

    public void displayMap() {
        String display = "";
        for(int y = 0; y < map.getMap().length; y++) {
            for(int x = 0; x < map.getMap()[y].length; x++) {
                display += map.getMap()[y][x];
            }
            display += "\n";
        }

        tvMap.setText(display);
    }
}
