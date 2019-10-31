package com.android_view.basic_anim;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import android.widget.Toast;

import com.android_view.R;

/**
 * 属性动画
 * ValueAnimator 方法详解
 * <p>
 * ValueAnimator setDuration(long duration)设置动画时长，单位是毫秒
 * Object getAnimatedValue();获取ValueAnimator在运动时，当前运动点的值
 * void start()开始动画
 * void setRepeatCount(int value)设置循环次数,设置为INFINITE表示无限循环
 * void setRepeatMode(int value)设置循环模式 value取值有RESTART，REVERSE，
 * void cancel()取消动画
 */


public class AttributeAnimationActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv;
    private TextView tvAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attribute_animation);

        findViewById(R.id.btn_attr).setOnClickListener(this);
        findViewById(R.id.btn).setOnClickListener(this);
        findViewById(R.id.btn_attr_widget).setOnClickListener(this);
        findViewById(R.id.btn_ad).setOnClickListener(this);
        findViewById(R.id.btn_word).setOnClickListener(this);
        tv = findViewById(R.id.tv);
        tv.setOnClickListener(this);
        tvAd = findViewById(R.id.tv_ad);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn:
                final TranslateAnimation animation = new TranslateAnimation(Animation.ABSOLUTE, 0, Animation.ABSOLUTE, 400,
                        Animation.ABSOLUTE, 0, Animation.ABSOLUTE, 400);
                animation.setFillAfter(true);
                animation.setDuration(1000);
                tv.startAnimation(animation);
                break;
            case R.id.tv:
                Toast.makeText(AttributeAnimationActivity.this, "clicked me", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_attr:

                ValueAnimator animator = ValueAnimator.ofInt(0, 400);
                animator.setDuration(1000);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        int curValue = (int) animation.getAnimatedValue();
                        Log.d("WY", "curValue:" + curValue);
                    }
                });
                animator.start();
                break;
            //属性动画对控件的作用
            case R.id.btn_attr_widget:
                doAttrAnimatioin();
                break;
            case R.id.btn_ad:
                adExample();
                break;
            case R.id.btn_word:
                showWord();
                break;
        }
    }


    private void doAttrAnimatioin() {

        ValueAnimator animator = ValueAnimator.ofInt(0, 400);
        animator.setDuration(1000);

        animator.setRepeatCount(ValueAnimator.INFINITE);//设置循环次数,设置为INFINITE表示无限循环
        animator.setRepeatMode(ValueAnimator.REVERSE);//设置循环模式 value取值有RESTART，REVERSE，
//        animator.setRepeatCount(-1);

        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int curValue = (int) animation.getAnimatedValue();
                tv.layout(curValue, curValue, curValue + tv.getWidth(), curValue + tv.getHeight());
            }
        });
        animator.start();
    }


    private void adExample() {

        WindowManager manager = getWindowManager();
        DisplayMetrics outMetrics = new DisplayMetrics();
        manager.getDefaultDisplay().getMetrics(outMetrics);
        int width = outMetrics.widthPixels;

        ValueAnimator animator = ValueAnimator.ofInt(-tv.getWidth(), width);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setDuration(3000);
//        //设置插值器，改变动画的速度变化
        animator.setInterpolator(new BounceInterpolator());
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int currentValue = (int) valueAnimator.getAnimatedValue();
                tvAd.layout(currentValue, 0, tv.getWidth() + currentValue, tv.getHeight());
            }
        });
        animator.start();


    }


    /**
     * 按序显示文字
     */
    private void showWord() {
        ValueAnimator animator = ValueAnimator.ofObject(new CharEvaluator(), new Character('A'), new Character('Z'));
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                char text = (char) animation.getAnimatedValue();
                tv.setText(String.valueOf(text));
            }
        });
        animator.setDuration(1000);
        animator.setInterpolator(new LinearInterpolator());
        animator.setRepeatCount(-1);
        animator.start();

    }


    class CharEvaluator implements TypeEvaluator<Character> {


        @Override
        public Character evaluate(float v, Character character, Character t1) {
            int startInt = (int) character;
            int endInt = (int) t1;
            int curInt = (int) (startInt + v * (endInt - startInt));
            char result = (char) curInt;


            Log.e("WY", "startInt=" + startInt + "  endInt=" + endInt + "  curInt=" + curInt + "  v=" + v + "  result=" + result);


            return result;
        }
    }


}
