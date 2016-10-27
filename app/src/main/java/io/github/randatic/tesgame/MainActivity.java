package io.github.randatic.tesgame;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tvMap, tvEvents;
    private Game game;
    private Button up, down, left, right, action, inventory;

    public MonsterSpawner monsterSpawner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wirewidget();
        displayMap(game.getMap());
        displayEvent(game.getEventString());

    }

    public void displayMap(Map map) {

        String display = "";
        for(int y = 0; y < map.getMap().length; y++) {
            for(int x = 0; x < map.getMap()[y].length; x++) {
                display += map.getMap()[y][x];
            }
            display += "\n";
        }
        map.addMonster(monsterSpawner);
        tvMap.setText(display);
    }

    public void displayEvent(String events)
    {
        tvEvents.setText(events);
    }

    @Override
    public void onClick(View view)
    {

        if (view.getId() == R.id.buttonUp)
        {
            game.getMap().movePlayer(Map.UP, game.getPlayer());
            displayMap(game.getMap());
        }
        else if (view.getId() == R.id.buttonRight)
        {
            game.getMap().movePlayer(Map.RIGHT, game.getPlayer());
            displayMap(game.getMap());
        }
        else if (view.getId() == R.id.buttonDown)
        {
            game.getMap().movePlayer(Map.DOWN, game.getPlayer());
            displayMap(game.getMap());
        }
        else if (view.getId() == R.id.buttonLeft)
        {
            game.getMap().movePlayer(Map.LEFT, game.getPlayer());
            displayMap(game.getMap());
        }

        else if (view.getId() == R.id.buttonInventory)
        {
            startActivity(new Intent(MainActivity.this,ShowPopupWindowInventory.class));
        }
        else if (view.getId() == R.id.buttonAction)
        {
            game.Action();
        }

    }

    public void wirewidget()
    {
        game = new Game();

        tvMap = (TextView) findViewById(R.id.textViewMap);
        tvMap.setTypeface(Typeface.MONOSPACE); //makes characters the same size
        tvEvents = (TextView) findViewById(R.id.textViewEvents);

        up = (Button) findViewById(R.id.buttonUp);
        down = (Button) findViewById(R.id.buttonDown);
        left = (Button) findViewById(R.id.buttonLeft);
        right = (Button) findViewById(R.id.buttonRight);
        action = (Button) findViewById(R.id.buttonAction);
        inventory = (Button) findViewById(R.id.buttonInventory);

        up.setOnClickListener(this);
        down.setOnClickListener(this);
        right.setOnClickListener(this);
        left.setOnClickListener(this);
        inventory.setOnClickListener(this);
    }
}
