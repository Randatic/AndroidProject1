package io.github.randatic.tesgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MapTestActivity extends AppCompatActivity {

    private TextView map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_test);

        map = (TextView) findViewById(R.id.textView);

    }

    public void updateMap() {

    }
}