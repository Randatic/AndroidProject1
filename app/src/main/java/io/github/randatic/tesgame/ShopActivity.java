package io.github.randatic.tesgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ellis on 10/21/2016.
 */
public class ShopActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String PURCHASED_WEAPON_ID = "pwid";
    private Button btnItem1, btnItem2, btnItem3;
    private TextView tvItem1, tvItem2, tvItem3, tvMoney;
    private int money;
    private Intent i1;
    private Shop shop;
    private ArrayList<Weapon> weapons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .91), (int) (height * .6));

        shop = new Shop();
        weapons = shop.getItems();
        wireWidgets();
        stockShop(weapons);

        Intent i = getIntent();
        i1 = new Intent();
        money = i.getIntExtra(MainActivity.CASH, -1);
    }

    private void stockShop(ArrayList<Weapon> weapons) {
        //Item
        tvItem1.setText(weapons.get(0).getName());
        tvItem2.setText(weapons.get(1).getName());
        tvItem3.setText(weapons.get(2).getName());
        //price
        btnItem1.setText("" + weapons.get(0).getValue());
        btnItem2.setText("" + weapons.get(1).getValue());
        btnItem3.setText("" + weapons.get(2).getValue());

        tvMoney.setText("Money: " + money);
    }

    private void wireWidgets() {
        btnItem1 = (Button) findViewById(R.id.button_item1);
        btnItem2 = (Button) findViewById(R.id.button_item2);
        btnItem3 = (Button) findViewById(R.id.button_item3);
        tvItem1 = (TextView) findViewById(R.id.textView_item1);
        tvItem2 = (TextView) findViewById(R.id.textView_item2);
        tvItem3 = (TextView) findViewById(R.id.textView_item3);
        tvMoney = (TextView) findViewById(R.id.textView_money);

        btnItem1.setOnClickListener(this);
        btnItem2.setOnClickListener(this);
        btnItem3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button_item1) {
            i1.putExtra(PURCHASED_WEAPON_ID, weapons.get(0).getID());
        } else  if(view.getId()==R.id.button_item2) {
            i1.putExtra(PURCHASED_WEAPON_ID, weapons.get(1).getID());
        } else  if(view.getId()==R.id.button_item3) {
            i1.putExtra(PURCHASED_WEAPON_ID, weapons.get(2).getID());
        }
        setResult(Activity.RESULT_OK, i1);
        finish();
    }
}
