package com.example.sandhu.q3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         new Handler().postDelayed(new Runnable() {

            public void run() {
                Intent waiting = new Intent(MainActivity.this, home.class);
                startActivity(waiting);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
