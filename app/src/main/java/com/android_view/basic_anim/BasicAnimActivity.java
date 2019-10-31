package com.android_view.basic_anim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android_view.R;

public class BasicAnimActivity extends AppCompatActivity implements View.OnClickListener {

//    Button scaleBtn	;
//    Animation scaleAnimation;
//
//    TextView tv;

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
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.setanim);
        //TODO 加载动画是 startAnimation
        iv.startAnimation(animation);
    }

}
