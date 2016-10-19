package io.github.randatic.tesgame;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by csaper6 on 10/17/16.
 */
public class ShowPopupWindowInventory extends Activity {

    private LinearLayout layout1, layout2, layout3, layout4, layout5, layout6, layout7;
    private Button button1, button2, button3, button4, button5, button6, button7;
    private TextView text1, text2, text3, text4, text5, text6, text7;

    public Character character;


    protected void onCreate(Bundle savedinstanceState)
    {
        super.onCreate(savedinstanceState);

        setContentView(R.layout.showpopupwindowinventory);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .91), (int)(height * .6));
        wirewidget();
        LinearLayout[] layouts = new LinearLayout[] {layout1,layout2,layout3,layout4,layout5,layout6,layout7};
        switch (character.getItemNumber())
        {
            case 1:
                layout2.setVisibility(View.GONE);layout3.setVisibility(View.GONE);layout4.setVisibility(View.GONE);layout5.setVisibility(View.GONE);layout6.setVisibility(View.GONE);layout7.setVisibility(View.GONE);break;
            case 2:
                layout3.setVisibility(View.GONE);layout4.setVisibility(View.GONE);layout5.setVisibility(View.GONE);layout6.setVisibility(View.GONE);layout7.setVisibility(View.GONE);break;
            case 3:
                layout4.setVisibility(View.GONE);layout5.setVisibility(View.GONE);layout6.setVisibility(View.GONE);layout7.setVisibility(View.GONE);break;
            case 4:
                layout5.setVisibility(View.GONE);layout6.setVisibility(View.GONE);layout7.setVisibility(View.GONE);break;
            case 5:
                layout6.setVisibility(View.GONE);layout7.setVisibility(View.GONE);break;
            case 6:
                layout7.setVisibility(View.GONE);break;
            case 7:break;

        }



//TODO: make columns from layout appear as same number as inventory items
        //TODO: make next button to change items
        //TODO: button on the right makes item to use / equip
        //TODO: if want, make back button to go back
    }

    private void wirewidget() {

        layout1 = (LinearLayout) findViewById(R.id.layout_1);
        layout2 = (LinearLayout) findViewById(R.id.layout_2);
        layout3 = (LinearLayout) findViewById(R.id.layout_3);
        layout4 = (LinearLayout) findViewById(R.id.layout_4);
        layout5 = (LinearLayout) findViewById(R.id.layout_5);
        layout6 = (LinearLayout) findViewById(R.id.layout_6);
        layout7 = (LinearLayout) findViewById(R.id.layout_7);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        text1 = (TextView) findViewById(R.id.textView1);
        text2 = (TextView) findViewById(R.id.textView2);
        text3 = (TextView) findViewById(R.id.textView3);
        text4 = (TextView) findViewById(R.id.textView4);
        text5 = (TextView) findViewById(R.id.textView5);
        text6 = (TextView) findViewById(R.id.textView6);
        text7 = (TextView) findViewById(R.id.textView7);


    }
}
