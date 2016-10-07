package io.github.randatic.tesgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ellis on 10/5/2016.
 */
public class CharacterActivity extends AppCompatActivity {
    public Button atkButton, defButton, spdButton;
    private int atk, def, spd;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        atk = 10;
        def = 10;
        spd = 10;
        wireWidgets();
        final Character player = new Character();

        atkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setAtk(5);
            }
        });

        defButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setDef(5);
            }
        });

        spdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setSpd(5);
            }
        });


    }



    private void updateSpd() {
        spd += 5;
        spdButton.setText("" + spd);
    }

    private void updateDef() {
        def += 5;
        defButton.setText("" + def);
    }

    private void updateAtk() {
        atk += 5;
        atkButton.setText("" + atk);
    }


    private void wireWidgets() {
        atkButton = (Button) findViewById(R.id.button_atk);
        defButton = (Button) findViewById(R.id.button_def);
        spdButton = (Button) findViewById(R.id.button_spd);
    }

}
