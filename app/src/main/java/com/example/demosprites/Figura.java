package com.example.demosprites;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.Objects;

public abstract class Figura {
    private static int id_auto = 1;
    private int id;
    private float x,y;

    public Figura(float x, float y) {
        this.id = id_auto;
        this.x = x;
        this.y = y;
        id_auto++;
    }

    public int getId() {
        return id;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figura figura = (Figura) o;
        return id == figura.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    abstract public void moverFigura(Canvas c, Paint p);

    abstract public boolean estaDentro(float x, float y);

    abstract public void actualizarFigura(float x, float y);
}
