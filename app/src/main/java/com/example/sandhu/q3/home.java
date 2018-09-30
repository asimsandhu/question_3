package com.example.sandhu.q3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    public Button butt2;


        public void init(){
            butt2=(Button)findViewById(R.id.butt2);
            butt2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent red=new Intent(home.this,Register.class);
                    startActivity(red);

                }
            });
    }



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        }

    }

