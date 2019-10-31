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
