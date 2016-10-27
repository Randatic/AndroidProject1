package io.github.randatic.tesgame;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    
    public final static String INVENTORY = "inventory";
    private Map map;
    private Character player;
    private String[] events;
    
    private TextView tvMap, tvEvents;
    private Button up, down, left, right, action, inventory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
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

    public void displayEvent()
    {
        tvEvents.setText(getEventString());
    }

    public String getEventString() {
        String eventString = "";

        for (String e : events) {
            eventString += e + "\n";
        }
        return eventString;
    }
    
    public void Action() {
        if(map.getMapData()[player.getPosition().getY()][player.getPosition().getX()] == 0) {
            //something
        }
    }

    public void addEvent(String e) {
        for(int i = 0;i < events.length-1; i++) {
            events[i] = events[i+1];
        }
        events[events.length-1] = e;
    }
    
    @Override
    public void onClick(View view)
    {

        if (view.getId() == R.id.buttonUp)
        {
            map.movePlayer(Map.UP, player);
            displayMap();
            addEvent("Moved north");
            displayEvent();
        }
        else if (view.getId() == R.id.buttonRight)
        {
            map.movePlayer(Map.RIGHT, player);
            displayMap();
            addEvent("Moved east");
            displayEvent();
        }
        else if (view.getId() == R.id.buttonDown)
        {
            map.movePlayer(Map.DOWN, player);
            displayMap();
            addEvent("Moved south");
            displayEvent();
        }
        else if (view.getId() == R.id.buttonLeft)
        {
            map.movePlayer(Map.LEFT, player);
            displayMap();
            addEvent("Moved west");
            displayEvent();
        }

        else if (view.getId() == R.id.buttonInventory)
        {
            Intent i = new Intent(this, ShowPopupWindowInventory.class);
            i.putExtra(INVENTORY, player.getInv().getItemsAsStringArray());
            startActivity(i);
        }
        else if (view.getId() == R.id.buttonAction)
        {
            Action();
        }

    }

    public void wireWidgets()
    {
        events = new String[] {"Welcome to Souls!", "Have fun!", "Don\'t die!", "Testing", "Last line"};
        player = new Character();
        map = new Map(player);
        
        tvMap = (TextView) findViewById(R.id.textViewMap);
        tvMap.setTypeface(Typeface.MONOSPACE); //makes text characters the same size
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
