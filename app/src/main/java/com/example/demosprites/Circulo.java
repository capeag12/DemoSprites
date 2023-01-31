package com.example.demosprites;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Circulo extends Figura {
    private int radio;

    public Circulo(float x, float y, int radio) {
        super(x, y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public void moverFigura(Canvas c, Paint p) {
        c.drawCircle(this.getX(),getY(),radio,p);

    }

    @Override
    public boolean estaDentro(float x, float y) {
        float distanciax = x - this.getX();
        float distanciaY = y- getY();
        if (Math.pow(radio,2) > (Math.pow(distanciax,2)+Math.pow(distanciaY,2))){
            return true;
        }
        else return false;
    }
    
    public boolean detectarCirculo(Circulo c){
        return estaDentro(c.getX(),c.getY());

    }

    public void aumentarRadio(float radio){
        this.radio+=radio;
    }

    @Override
    public void actualizarFigura(float desX, float desY) {
        setX(desX+getX());
        setY(desY+getY());
    }
}
