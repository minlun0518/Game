package com.tom.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bLeft =findViewById(R.id.button_left);
        Button bRight =findViewById(R.id.button_right);
        Button bUp =findViewById(R.id.button_up);
        Button bDown =findViewById(R.id.button_down);
/*
有了 findViewById(R.id.button_left).setOnClickListener(this); 就不用了
        bLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

 */

    }

    public void findView(View view){
        findViewById(R.id.button_left).setOnClickListener(this);
        findViewById(R.id.button_right).setOnClickListener(this);
        findViewById(R.id.button_up).setOnClickListener(this);
        findViewById(R.id.button_down).setOnClickListener(this);

    }


    public void left (View view){

    }

    public void right (View view){

    }

    public void up (View view){

    }

    public void down (View view){

    }

    @Override
    public void onClick(View v) {
        Log.d("MainActivity","onClick");

    }
}
