package com.example.demosprites;

import android.graphics.Canvas;

public abstract class Control {
    private float x,y;
    private float radio;

    public Control(float x, float y, float radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getRadio() {
        return radio;
    }

    public abstract void dibujarControl(Canvas c);

    public abstract boolean estaDentro(float x, float y);
}



