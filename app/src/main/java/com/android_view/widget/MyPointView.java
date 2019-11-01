package com.android_view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyPointView extends View {


    private Point mPoint = new Point(100);


    public MyPointView(Context context) {
        this(context,null);
    }

    public MyPointView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyPointView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (null != mPoint){
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(300,300,mPoint.getmRadius(),paint);
        }
        super.onDraw(canvas);
    }


    public void setPointRadius(int radius){
        mPoint.setmRadius(radius);
        invalidate();
    }


    public int getPointRadius(){
        return mPoint.getmRadius();
    }



}
