package io.github.randatic.tesgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MapTestActivity extends AppCompatActivity {

    private TextView tvMap;
    private Map map;
    private Place[] places;
    private Character character;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_test);

        places = new Place[] {new Place(new Position(3, 6), "Hull House", "Settlement House", Assets.INN)};
        character = new Character();
        tvMap = (TextView) findViewById(R.id.textViewMap);
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