package com.example.demosprites;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class Rectangulo extends Figura{
    private int anchura, altura;

    public Rectangulo(float x, float y, int anchura, int altura) {
        super(x, y);
        this.anchura = anchura;
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public void moverFigura(Canvas c, Paint p) {
        c.drawRect(new Rect((int)getX(),(int)getY(),(int)(getX()+anchura),(int)(getY()+altura)),p);

    }

    @Override
    public boolean estaDentro(float x, float y) {
        if (x>getX() && x< (getX()+anchura) && y>getY() && y<(getY()+anchura)){
            return true;
        } else return false;
    }

    @Override
    public void actualizarFigura(float desX, float desY) {
        setX(desX+getX());
        setY(desY+getY());
    }
}
