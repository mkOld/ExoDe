package com.oc.exo.exode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout ll6SlidedDice, ll20SlidedDice;
    int nbSlide = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll6SlidedDice = (LinearLayout)findViewById(R.id.ll6SlidedDice);
        ll20SlidedDice = (LinearLayout)findViewById(R.id.ll20SlidedDice);
        initListener();
    }

    private void initListener(){
        ll6SlidedDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "6", Toast.LENGTH_SHORT).show();
                nbSlide = 6;
                Intent intent = new Intent(getBaseContext(), RollingActivity.class);
                intent.putExtra("NB_SLIDE", nbSlide);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });

        ll20SlidedDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "20", Toast.LENGTH_SHORT).show();
                nbSlide = 20;
                Intent intent = new Intent(getBaseContext(), RollingActivity.class);
                intent.putExtra("NB_SLIDE", nbSlide);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
    }

}
