package com.tom.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class GameView extends View {

    float posX, posY;

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("game", "onDraw " + getWidth() + "," + getHeight());
        Paint paint = new Paint();
        Paint paint0 = new Paint();
        canvas.drawLine(0, 0, 0, 0, paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.monday);
        canvas.drawBitmap(bitmap, posX, posY, paint0);
    }

    public void moveRight(){
        if(posX<getWidth()-500){
            this.posX+=50;
        }
    }

    public void moveLeft(){
        if(posX>=0){
            this.posX-=50;
        }
    }

    public void moveUp(){
        if(posY>=0){
            this.posY-=50;
        }
    }
    public void moveDown(){
        if(posY<getHeight()-150-getResources().){
            this.posY+=50;
        }

    }


    public float getPosX() {

        return posX;
    }

    public void setPosX(float posX) {
        if (posX > 0 && posX < getWidth() - 220) {
            this.posX = posX;
        }
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        if (posY > 0 && posY < getHeight() - 220) {
            this.posY = posY;
        }
    }
}
