package com.android_view.basic_anim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android_view.R;


/**
 * AccelerateDecelerateInterpolator   在动画开始与结束的地方速率改变比较慢，在中间的时候加速
 * AccelerateInterpolator             在动画开始的地方速率改变比较慢，然后开始加速
 * AnticipateInterpolator             开始的时候向后然后向前甩
 * AnticipateOvershootInterpolator    开始的时候向后然后向前甩一定值后返回最后的值
 * BounceInterpolator                 动画结束的时候弹起
 * CycleInterpolator                  动画循环播放特定的次数，速率改变沿着正弦曲线
 * DecelerateInterpolator             在动画开始的地方快然后慢
 * LinearInterpolator                 以常量速率改变
 * OvershootInterpolator              向前甩一定值后再回到原来位置
 */
public class BasicAnimActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_anim);
        iv = findViewById(R.id.iv);
        findViewById(R.id.alpha).setOnClickListener(this);
        findViewById(R.id.scale).setOnClickListener(this);
        findViewById(R.id.rotate).setOnClickListener(this);
        findViewById(R.id.translate).setOnClickListener(this);
        findViewById(R.id.set).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.alpha:
                alpha();
                break;
            case R.id.scale:
                scale();
                break;
            case R.id.rotate:
                rotate();
                break;
            case R.id.translate:
                translate();
                break;
            case R.id.set:
                set();
                break;
        }
    }


    private void alpha() {
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alphaanim);
//        //TODO 加载动画是 startAnimation
//        iv.startAnimation(animation);


        AlphaAnimation alphaAnim = new AlphaAnimation(0.2f, 1.0f);
        alphaAnim.setDuration(3000);
        alphaAnim.setFillBefore(true);
        iv.startAnimation(alphaAnim);


    }

    private void scale() {
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scaleanim);
//        //TODO 加载动画是 startAnimation
//        iv.startAnimation(animation);

        ScaleAnimation scaleAnim = new ScaleAnimation(0.0f,1.4f,0.0f,1.4f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        scaleAnim.setDuration(2000);
        scaleAnim.setRepeatCount(-1);
        scaleAnim.setFillBefore(true);
        scaleAnim.setRepeatMode(Animation.REVERSE);
        iv.startAnimation(scaleAnim);


    }

    private void rotate() {
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotateanim);
//        //TODO 加载动画是 startAnimation
//        iv.startAnimation(animation);


        RotateAnimation rotateAnim = new RotateAnimation(0, 359, Animation.RELATIVE_TO_SELF,
                0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnim.setDuration(3000);
        rotateAnim.setFillAfter(true);
        iv.startAnimation(rotateAnim);

    }

    private void translate() {
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translateanim);
//        //TODO 加载动画是 startAnimation
//        iv.startAnimation(animation);

        TranslateAnimation translateAnim = new TranslateAnimation(0,-80,0,-80);
        translateAnim.setDuration(2000);
        translateAnim.setFillBefore(true);
        iv.startAnimation(translateAnim);
    }

    private void set() {
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.setanim);
//        //TODO 加载动画是 startAnimation
//        iv.startAnimation(animation);


        AlphaAnimation alphaAnim = new AlphaAnimation(1.0f,0.1f);
        ScaleAnimation scaleAnim = new ScaleAnimation(0.0f,1.4f,0.0f,1.4f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        RotateAnimation rotateAnim = new RotateAnimation(0, 720, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

        AnimationSet setAnim=new AnimationSet(true);

        setAnim.addAnimation(alphaAnim);
        setAnim.addAnimation(scaleAnim);
        setAnim.addAnimation(rotateAnim);

        setAnim.setDuration(3000);
        setAnim.setFillAfter(true);

        iv.startAnimation(setAnim);


    }

}
