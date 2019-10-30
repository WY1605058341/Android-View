package com.android_view.basic_anim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alphaanim);
        //TODO 加载动画是 startAnimation
        iv.startAnimation(animation);
    }

    private void scale() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scaleanim);
        //TODO 加载动画是 startAnimation
        iv.startAnimation(animation);
    }

    private void rotate() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotateanim);
        //TODO 加载动画是 startAnimation
        iv.startAnimation(animation);
    }

    private void translate() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translateanim);
        //TODO 加载动画是 startAnimation
        iv.startAnimation(animation);
    }

    private void set() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.setanim);
        //TODO 加载动画是 startAnimation
        iv.startAnimation(animation);
    }

}
