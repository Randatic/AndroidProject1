package io.github.randatic.tesgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by csaper6 on 10/17/16.
 */
public class ShowPopupWindowInventory extends Activity{

    private TextView textViewInv, textViewStats;
    private String invText, statsText;
    private String[] inv, stats;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showpopupwindowinventory);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .91), (int) (height * .6));

        textViewInv = (TextView) findViewById(R.id.textView_inventory);
        textViewStats = (TextView) findViewById(R.id.textView_stats);

        statsText = "";
        invText = "";

        Intent i = getIntent();
        inv = i.getStringArrayExtra(MainActivity.INVENTORY);
        stats = i.getStringArrayExtra(MainActivity.STATS);
        for(String s:stats) {
            statsText += s;
        }
        for(String s : inv) {
            invText += s + "\n";
        }

        textViewInv.setText(invText);
        textViewStats.setText(statsText);
    }
}

