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



    }

    public void displayMap() {

    }

}