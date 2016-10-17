package io.github.randatic.tesgame;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tvMap;
    private Map map;
    private Character character;
    private TextView eventShow;
    private Button up, down, left, right, action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wirewidget();
        displayMap();
        displayEvent();
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
    @Override
    public void onClick(View view)
    {
        int number = 0;
        if (view == up)
        {
            number = 0;
            map.movePlayer(number);
            map.updateMap();
            displayMap();
        }
        else if (view == right)
        {
            number = 1;
            map.movePlayer(number);
            map.updateMap();
            displayMap();
        }
        else if (view == down)
        {
            number = 2;
            map.movePlayer(number);
            map.updateMap();
            displayMap();
        }
        else
        {
            number = 3;
            map.movePlayer(number);
            map.updateMap();
            displayMap();
        }
    }

    public void wirewidget()
    {
        character = new Character();
        tvMap = (TextView) findViewById(R.id.textViewMap);
        up = (Button) findViewById(R.id.buttonUp);
        down = (Button) findViewById(R.id.buttonDown);
        left = (Button) findViewById(R.id.buttonLeft);
        right = (Button) findViewById(R.id.buttonRight);
        action = (Button) findViewById(R.id.buttonAction);
        tvMap.setTypeface(Typeface.MONOSPACE); //makes characters the same size
        eventShow = (TextView) findViewById(R.id.textViewEvents);
        map = new Map(character);
    }







    public void displayEvent()
    {

    }


}
