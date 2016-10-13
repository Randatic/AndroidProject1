package io.github.randatic.tesgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
 * Created by Ellis on 10/5/2016.
 */
public class CharacterActivity extends AppCompatActivity{
    public Button atkButton, defButton, spdButton;
    public TextView nameView;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        wireWidgets();
        final Character player = new Character();

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

        nameView.setText(nameView + player.getName());


    }

    private void wireWidgets() {
        atkButton = (Button) findViewById(R.id.button_atk);
        defButton = (Button) findViewById(R.id.button_def);
        spdButton = (Button) findViewById(R.id.button_spd);
        nameView = (TextView) findViewById(R.id.textView_chartitle);
    }

}
