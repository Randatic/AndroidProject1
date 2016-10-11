package io.github.randatic.tesgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ellis on 10/5/2016.
 */
public class CharacterActivity extends AppCompatActivity {
    public Button atkButton, defButton, spdButton, okButton;
    private String name;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        wireWidgets();
        final Character player = new Character(name);

        atkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setAttack(5);
            }
        });

        defButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setDefence(5);
            }
        });

        spdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setSpeed(5);
            }
        });

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    private void wireWidgets() {
        atkButton = (Button) findViewById(R.id.button_atk);
        defButton = (Button) findViewById(R.id.button_def);
        spdButton = (Button) findViewById(R.id.button_spd);
        okButton = (Button) findViewById(R.id.button_ok);
    }

}
