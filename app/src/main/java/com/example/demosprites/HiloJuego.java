package com.example.demosprites;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;

public class HiloJuego extends Thread{
    private SurfaceHolder holder;
    private MoverFigura mover;
    private boolean run;
    static final long FPS = 60;



    public HiloJuego(MoverFigura mover) {
        this.mover = mover;
        this.holder = this.mover.getHolder();
        run = false;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    @Override
    public synchronized void run() {
        long ticksPS = 1000/FPS;
        long startTime, sleepTime;
        System.out.println("Pintado");
        super.run();
        while (run==true){
            Canvas canvas = null;
            startTime = System.currentTimeMillis();

            try{
                canvas = holder.lockCanvas();
                if (canvas!=null){
                    synchronized (holder){
                        Paint p = new Paint();
                        p.setColor(Color.RED);
                        p.setAntiAlias(true);




                        mover.postInvalidate();
                    }
                }
            } finally {
                if (canvas!=null){
                    holder.unlockCanvasAndPost(canvas);
                }
            }
            sleepTime = ticksPS - (System.currentTimeMillis()-startTime);
            try {
                if (sleepTime>0){
                    sleep(sleepTime);
                } else sleep(10);
            } catch (Exception e){

            }
            canvas = holder.lockCanvas();
            mover.postInvalidate();
            holder.unlockCanvasAndPost(canvas);
        }
    }
}
