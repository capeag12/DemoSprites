package com.example.demosprites;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Sprites {
    private int x = 0;
    private int xSpeed = 5;
    private MoverFigura gameview;
    private Bitmap bitmap;

    public Sprites(MoverFigura gameview, Bitmap bitmap) {
        this.gameview = gameview;
        this.bitmap = bitmap;
    }

    private void update(){
        x=x+xSpeed;
    }

    public void onDraw(Canvas c){
        update();
        c.drawBitmap(bitmap,x,10,null);
    }
}
