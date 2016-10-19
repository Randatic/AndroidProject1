package io.github.randatic.tesgame;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

/**
 * Created by csaper6 on 10/17/16.
 */
public class ShowPopupWindowInventory extends Activity {
    protected void onCreate(Bundle savedinstanceState)
    {
        super.onCreate(savedinstanceState);

        setContentView(R.layout.showpopupwindowinventory);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .91), (int)(height * .6));


//TODO: make columns from layout appear as same number as inventory items
        //TODO: make next button to change items
        //TODO: button on the right makes item to use / equip
        //TODO: if want, make back button to go back
    }
}
