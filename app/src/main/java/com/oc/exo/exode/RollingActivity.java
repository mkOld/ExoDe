package com.oc.exo.exode;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class RollingActivity extends Activity {

    TextView tvTitle, tvRollingValue;
    Button btnRolling;
    int nbSlide = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolling);

        nbSlide = RollingActivity.this.getIntent().getIntExtra("NB_SLIDE", 1);
        tvRollingValue = (TextView)findViewById(R.id.tvRollingValue);
        tvTitle = (TextView)findViewById(R.id.tvTitle);
        tvTitle.setText(nbSlide + " sided dice");

        btnRolling = (Button)findViewById(R.id.btnRoll);
        btnRolling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollingDice();
            }
        });
    }

    public void rollingDice(){
        Random randomGenerator = new Random();
        tvRollingValue.setText("" + (randomGenerator.nextInt(nbSlide)+1));
    }

}
