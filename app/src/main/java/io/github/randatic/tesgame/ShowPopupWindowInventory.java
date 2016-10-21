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
public class ShowPopupWindowInventory extends Activity implements View.OnClickListener{

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
        character = new Character();
        LinearLayout[] layout = new LinearLayout[] {layout1, layout2, layout3, layout4, layout5, layout6, layout7};
        TextView[] text = new TextView[] {text1, text2, text3, text4, text5, text6, text7};
        for (int i = 0; i < character.getInv().getInventorySize(); i++)
        {
            layout[i].setVisibility(View.VISIBLE);
            text[i].setText("" + character.getInv().getItem(i));

        }




//TODO: make columns from layout appear as same number as inventory items
        //TODO: make next button to change items
        //TODO: button on the right makes item to use / equip
        //TODO: if want, make back button to go back
    }

    private void wirewidget() {

        layout1 = (LinearLayout) findViewById(R.id.layout_1);layout1.setVisibility(View.GONE);
        layout2 = (LinearLayout) findViewById(R.id.layout_2);layout2.setVisibility(View.GONE);
        layout3 = (LinearLayout) findViewById(R.id.layout_3);layout3.setVisibility(View.GONE);
        layout4 = (LinearLayout) findViewById(R.id.layout_4);layout4.setVisibility(View.GONE);
        layout5 = (LinearLayout) findViewById(R.id.layout_5);layout5.setVisibility(View.GONE);
        layout6 = (LinearLayout) findViewById(R.id.layout_6);layout6.setVisibility(View.GONE);
        layout7 = (LinearLayout) findViewById(R.id.layout_7);layout7.setVisibility(View.GONE);
        button1 = (Button) findViewById(R.id.button1);button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button4);button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.button5);button5.setOnClickListener(this);
        button6 = (Button) findViewById(R.id.button6);button6.setOnClickListener(this);
        button7 = (Button) findViewById(R.id.button7);button7.setOnClickListener(this);
        text1 = (TextView) findViewById(R.id.textView1);
        text2 = (TextView) findViewById(R.id.textView2);
        text3 = (TextView) findViewById(R.id.textView3);
        text4 = (TextView) findViewById(R.id.textView4);
        text5 = (TextView) findViewById(R.id.textView5);
        text6 = (TextView) findViewById(R.id.textView6);
        text7 = (TextView) findViewById(R.id.textView7);



    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.button1)
        {
            character.getInv().useItem(character.getInv().getItem(1));
        }
        else if (view.getId() == R.id.button2)
        {
            character.getInv().useItem(character.getInv().getItem(1));
        }
        else if (view.getId() == R.id.button3)
        {
            character.getInv().useItem(character.getInv().getItem(2));
        }
        else if (view.getId() == R.id.button4)
        {
            character.getInv().useItem(character.getInv().getItem(3));
        }
        else if (view.getId() == R.id.button5)
        {
            character.getInv().useItem(character.getInv().getItem(4));
        }
        else if (view.getId() == R.id.button6)
        {
            character.getInv().useItem(character.getInv().getItem(5));
        }
        else if (view.getId() == R.id.button7)
        {
            character.getInv().useItem(character.getInv().getItem(6));
        }
    }
}
