package io.github.randatic.tesgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by csaper6 on 10/17/16.
 */
public class ShowPopupWindowInventory extends Activity{

    private String invAdd;
    private TextView tvInv;
    private LinearLayout[] layout;
    private String[] inv;




    protected void onCreate(Bundle savedinstanceState)
    {
        super.onCreate(savedinstanceState);

        setContentView(R.layout.showpopupwindowinventory);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .91), (int)(height * .6));
        tvInv = (TextView) findViewById(R.id.textViewInv);

        invAdd = "";

        Intent i = getIntent();
        inv = i.getStringArrayExtra(MainActivity.INVENTORY);

        for(String s : inv) {
            invAdd += s + "\n";
        }

        tvInv.setText(invAdd);
    }
}
