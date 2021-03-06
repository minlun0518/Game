package com.tom.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    private GameView gameView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
    }

    public void findView (){
        findViewById(R.id.button_left).setOnClickListener(this);
        findViewById(R.id.button_right).setOnClickListener(this);
        findViewById(R.id.button_up).setOnClickListener(this);
        findViewById(R.id.button_down).setOnClickListener(this);
        gameView = findViewById(R.id.game);
    }




    @Override
    public void onClick(View view) {
        Log.d("MainActivity","onClick");
        switch (view.getId()){
            case R.id.button_up:
                Log.d("MainActivity","onClick.up");
                //gameView.setPosY(gameView.getY()-50);
                gameView.moveUp();
                gameView.invalidate();
                break;
            case R.id.button_down:
                Log.d("MainActivity","onClick.down");
                //gameView.setPosY(gameView.getY()+50);
                gameView.moveDown();
                gameView.invalidate();
                Log.d("MainActivity","posY="+gameView.getPosX());
                break;
            case R.id.button_left:
                Log.d("MainActivity","onClick.left");
                gameView.moveLeft();
                //gameView.setPosX(gameView.getX()-50);
                Log.d("MainActivity","posX="+gameView.getPosX());
                gameView.invalidate();
                break;
            case R.id.button_right:
                Log.d("MainActivity","onClick.right");
                //gameView.setPosX(gameView.getX()+50); ！不要寫在自己身上　找死
                gameView.moveRight();
                gameView.invalidate();
                Log.d("MainActivity","posX="+gameView.getPosX());
                break;

        }
        Log.d("MainActivity","(posX,posY)= ("+gameView.getPosX()+","+gameView.getPosY()+")");

        if(gameView.getPosY()>200){
            Toast.makeText(this, "你要我去哪裡", Toast.LENGTH_SHORT).show();
        }

    }


}
