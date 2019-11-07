package com.android_view.widget;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class TestCustomView extends View {

    private Paint mPaint;


    public TestCustomView(Context context) {
        this(context, null);
    }

    public TestCustomView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TestCustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }


    private void initPaint() {

    }


//    private Paint mPaint;
//
//    private Bitmap bitmap1;
//    private Bitmap bitmap2;
//
//
//    public TestCustomView(Context context) {
//        this(context, null);
//    }
//
//    public TestCustomView(Context context, AttributeSet attrs) {
//        this(context, attrs, 0);
//    }
//
//    public TestCustomView(Context context, AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//        mPaint = new Paint();
//        mPaint.setAntiAlias(true);
//        mPaint.setDither(true);
//        mPaint.setColor(Color.RED);
//        mPaint.setStyle(Paint.Style.FILL);
//
//        bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.ic_square_green);
//        bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.ic_square_red);
//
//
//    }
//
////
////    @Override
////    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
////        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
////
////        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
////        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
////
////        /**
////         * 如果该自定义view的 android:layout_width="wrap_content"  那么 mode 就是 MeasureSpec.AT_MOST
////         * 如果该自定义view的 android:layout_width="match_parent"  那么 mode 就是 MeasureSpec.EXACTLY
////         * 如果该自定义view的 android:layout_width="300dp"  那么 mode 就是 MeasureSpec.EXACTLY
////         *
////         */
////
////
////    }
//
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//
//
////        canvas.drawBitmap(bitmap1, 0, 0, mPaint);
//
////        canvas.scale(2f, 2f);
////        canvas.drawBitmap(bitmap2, SizeUtil.Dp2Px(getContext(),30), SizeUtil.Dp2Px(getContext(),30), mPaint);
//        canvas.drawBitmap(bitmap2, DensityUtils.dip2px(getContext(),30), DensityUtils.dip2px(getContext(),30), mPaint);
//
//        super.onDraw(canvas);
//    }
}
