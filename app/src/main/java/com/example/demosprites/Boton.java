package com.example.demosprites;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Boton extends Control {
    private String texto;
    private int color;


    public Boton(String texto,float x, float y, float radio,  int color) {
        super(x, y, radio);
        this.texto = texto;
        this.color = color;
    }

    public String getTexto() {
        return texto;
    }


    public boolean estaDentro(float x, float y){
        float distanciax = x - this.getX();
        float distanciaY = y- getY();
        if (Math.pow(getRadio(),2) > (Math.pow(distanciax,2)+Math.pow(distanciaY,2))){
            return true;
        }
        else return false;
    }

    public void dibujarControl(Canvas c){
        Paint p = new Paint();
        p.setColor(color);
        c.drawCircle(this.getX(), this.getY(),this.getRadio(), p);
    }

    @Override
    public String toString() {
        return "Boton{" +
                "texto='" + texto + '\'' +
                ", x=" + getX() +
                ", y=" + getY() +
                ", radio=" + getRadio() +
                ", color=" + color +
                '}';
    }
}
