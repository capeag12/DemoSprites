package com.example.demosprites;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Imagen extends Figura{
    private Bitmap img;
    private int altura, anchura;

    public Imagen(float x, float y, Bitmap img, int altura, int anchura) {
        super(x, y);
        this.img = img.createScaledBitmap(img,anchura,altura,false);
        this.altura = altura;
        this.anchura = anchura;
    }

    public Bitmap getImg() {
        return img;
    }

    public int getAltura() {
        return altura;
    }

    public int getAnchura() {
        return anchura;
    }

    @Override
    public void moverFigura(Canvas c, Paint p) {
        c.drawBitmap(this.img, getX(),getY(),p);
    }

    @Override
    public boolean estaDentro(float x, float y) {
        if (x>getX() && x< (getX()+anchura) && y>getY() && y<(getY()+anchura)){
            return true;
        } else return false;
    }

    @Override
    public void actualizarFigura(float x, float y) {
        setX(x+getX());
        setY(y+getY());
    }
}
