package io.github.randatic.tesgame;

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
    private Button item1, item2, item3;
    private TextView price1, price2, price3, money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .91), (int) (height * .6));

        Shop s = new Shop();
        wireWidgets();
        stockShop(s.getItems());
    }

    private void stockShop(ArrayList<Weapon> a) {
        item1.setText(a.get(0).getName());
        item2.setText(a.get(1).getName());
        item3.setText(a.get(2).getName());
        price1.setText("" + a.get(0).getValue());
        price2.setText("" + a.get(1).getValue());
        price3.setText("" + a.get(2).getValue());
    }

    private void wireWidgets() {
        item1 = (Button) findViewById(R.id.button_item1);
        item2 = (Button) findViewById(R.id.button_item2);
        item3 = (Button) findViewById(R.id.button_item3);
        price1 = (TextView) findViewById(R.id.textView_price1);
        price2 = (TextView) findViewById(R.id.textView_price2);
        price3 = (TextView) findViewById(R.id.textView_price3);
        money = (TextView) findViewById(R.id.textView_cash);
    }

    @Override
    public void onClick(View view) {

    }
}
