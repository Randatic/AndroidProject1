package io.github.randatic.tesgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

        wireWidgets();
    }

    private void wireWidgets() {

    }

    @Override
    public void onClick(View view) {

    }
}
