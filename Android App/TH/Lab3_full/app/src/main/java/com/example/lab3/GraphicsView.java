package com.example.lab3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

//Ex1
public class GraphicsView extends View {
    public GraphicsView(Context context) {
        super(context);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        Rect r = new Rect(40, 40, 400, 200);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        canvas.drawRect(r, paint);
        invalidate();
    }
}




//Ex2
//public class GraphicsView extends View {
//
//    int x = 0;
//    int y= 0;
//    int d = 100;
//    int r = 50;
//    public GraphicsView(Context context){
//        super(context);
//    }
//    @Override
//    protected void onDraw(Canvas canvas) {
//        if (x!=0 && y!=0 ){
//            int right = x + d;
//            int bottom = y + r;
//            Rect r = new Rect(x,y,right,bottom);
//            Paint paint = new Paint();
//            paint.setStyle(Paint.Style.FILL);
//            paint.setColor(Color.RED);
//            canvas.drawRect(r, paint);
//
//        }
//
//        invalidate();
//    }
//
//    @SuppressLint("ClickableViewAccessibility")
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        x = (int) event.getX();
//        y = (int) event.getY();
//        return super.onTouchEvent(event);
//    }
//
//}




//Ex3
//public class GraphicsView extends View{
//
//    Bitmap[] frames = new Bitmap [16]; //16 frames
//    int i=0;
//
//    public GraphicsView(Context context) {
//        super(context);
//
//        frames [0] = BitmapFactory.decodeResource (getResources () ,R.drawable.hinh1);
//        frames [1] = BitmapFactory.decodeResource (getResources () , R.drawable.hinh2);
//        frames [2] = BitmapFactory.decodeResource (getResources () , R.drawable.hinh3);
//        frames [3] = BitmapFactory. decodeResource (getResources () , R.drawable.hinh4);
//
//    }
//
//
//
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        if (i < 100){
//            canvas.drawBitmap(frames[i], 40, 40, new Paint());
//        }
//        else {
//            i =0;
//        }
//        invalidate();
//    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        i=i+1;
//        return false;
//    }
//}





//Ex4
//public class GraphicsView extends View {
//
//    Bitmap[] frames = new Bitmap[16]; // 16 frames
//    int i = 0;
//    MediaPlayer mediaPlayer;
//
//    public GraphicsView(Context context) {
//        super(context);
//
//        frames[0] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh1);
//        frames[1] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh2);
//        frames[2] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh3);
//        frames[3] = BitmapFactory.decodeResource(getResources(), R.drawable.hinh4);
//
//        mediaPlayer = MediaPlayer.create(context, R.raw.nietpo);
//        mediaPlayer.setLooping(true);
//        mediaPlayer.start();
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        if (i < 16) {
//            canvas.drawBitmap(frames[i], 40, 40, new Paint());
//        } else {
//            i = 0;
//        }
//        invalidate();
//    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        i++;
//        return false;
//    }
//
//    @Override
//    protected void onDetachedFromWindow() {
//        super.onDetachedFromWindow();
//        mediaPlayer.stop();
//        mediaPlayer.release();
//    }
//}
