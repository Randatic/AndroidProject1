package io.github.randatic.tesgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InnActivity extends Activity implements View.OnClickListener{

    private TextView tvWelcome;
    private Button btnRest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inn);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .91), (int) (height * .6));

        Intent i = getIntent();

        setResult(Activity.RESULT_CANCELED);

        tvWelcome = (TextView) findViewById(R.id.textView_welcome);
        btnRest = (Button) findViewById(R.id.button_rest);
        btnRest.setOnClickListener(this);



        String text =
                ""
                + i.getStringArrayExtra(MainActivity.PLACE_INFO)[0]
                + "\n"
                + i.getStringArrayExtra(MainActivity.PLACE_INFO)[1];

        tvWelcome.setText(text);
    }

    @Override
    public void onClick(View view) {
        setResult(Activity.RESULT_OK);
        finish();
    }
}
