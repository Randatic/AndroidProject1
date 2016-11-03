package io.github.randatic.tesgame;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String INVENTORY = "inventory";
    public static final String STATS = "stats";
    public static final String PLACE_INFO = "place_info";
    public static final int RESTED_REQUEST = 0;

    private TextView tvMap, tvEvents;
    private Button up, down, left, right, action, inventory;

    private Map map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
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

    public void action() {
        Toast.makeText(this, "Action method", Toast.LENGTH_SHORT).show();
        Place p = map.getPlaceAtPlayer();
        if(p!=null) {
            Intent i;
            if(p.getType().equals(Place.INN)) {
                i = new Intent(this, InnActivity.class);
                i.putExtra(PLACE_INFO, new String[] {p.getName(), p.getDescription()});
                startActivityForResult(i, RESTED_REQUEST);
                Toast.makeText(this, "intent should start", Toast.LENGTH_SHORT).show();
            }
        }
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
            map.movePlayer(map.NORTH);
            map.update();
            displayMap();
        }
        else if (view.getId() == R.id.buttonRight)
        {
            map.movePlayer(map.EAST);
            map.update();
            displayMap();
        }
        else if (view.getId() == R.id.buttonDown)
        {
            map.movePlayer(map.SOUTH);
            map.update();
            displayMap();
        }
        else if (view.getId() == R.id.buttonLeft)
        {
            map.movePlayer(map.WEST);
            map.update();
            displayMap();
        }

        else if (view.getId() == R.id.buttonInventory)
        {
            Intent i = new Intent(this, ShowPopupWindowInventory.class);
            i.putExtra(INVENTORY, map.player.getInventory().getItemsAsStringArray());
            i.putExtra(STATS, map.player.getStatsFormattedStringArray());
            startActivity(i);
        }
        else if (view.getId() == R.id.buttonAction)
        {
            action();
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==RESTED_REQUEST) {
            if (resultCode == InnActivity.RESULT_OK) {
                map.player.resetHp();
            }
        }
    }

    public void wireWidgets()
    {
        map = new Map();

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
        action.setOnClickListener(this);
    }
}
