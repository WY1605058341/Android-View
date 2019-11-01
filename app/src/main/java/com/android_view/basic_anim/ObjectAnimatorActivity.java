package com.android_view.basic_anim;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.TextView;

import com.android_view.R;
import com.android_view.widget.MyPointView;

public class ObjectAnimatorActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnStartAnim;
    private Button btnStopAnim;
    private Button btnPoint;
    private Button btnBgColor;
    private TextView tv;
    private MyPointView mPointView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator);

        btnStartAnim = findViewById(R.id.btn_start_anim);
        btnStopAnim = findViewById(R.id.btn_stop_anim);
        btnPoint = findViewById(R.id.btn_point);
        tv = findViewById(R.id.tv);
        mPointView = findViewById(R.id.point_view);
        btnBgColor = findViewById(R.id.btn_bg_color);


        btnStartAnim.setOnClickListener(this);
        btnStopAnim.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        btnBgColor.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_start_anim:
                startObjectAnimator();
                break;
            case R.id.btn_stop_anim:
                break;
            case R.id.btn_point:
                doPointViewAnimation();
                break;
            case R.id.btn_bg_color:
                doBackgroundColorAnimation();
                break;
        }
    }


    private void startObjectAnimator() {

//        第一个参数用于指定这个动画要操作的是哪个控件
//        第二个参数用于指定这个动画要操作这个控件的哪个属性
//        alpha:透明度，
//        rotation:旋转角度
//        rotationX:绕X轴旋转角度
//        rotationY:绕Y轴旋转角度
//        translationX:沿X轴方向移动
//        translationY:沿Y轴方向移动
//        scaleX:沿X轴伸缩
//        scaleY:沿Y轴伸缩

//        第三个参数是可变长参数，这个就跟ValueAnimator中的可变长参数的意义一样了，就是指这个属性值是从哪变到哪。


//        ObjectAnimator animator = ObjectAnimator.ofFloat(tv, "alpha", 1, 0, 1, 0, 1, 0, 1);

//        ObjectAnimator animator = ObjectAnimator.ofFloat(tv, "rotation", 0, 180, 0);
//        ObjectAnimator animator = ObjectAnimator.ofFloat(tv, "rotationX", 0, 180, 0);
//        ObjectAnimator animator = ObjectAnimator.ofFloat(tv, "rotationY", 0, 360);


//        ObjectAnimator animator = ObjectAnimator.ofFloat(tv, "translationX", 0, 360);
//        ObjectAnimator animator = ObjectAnimator.ofFloat(tv, "translationY", 0, 360);

//        ObjectAnimator animator = ObjectAnimator.ofFloat(tv, "scaleX", 0, 2);
        ObjectAnimator animator = ObjectAnimator.ofFloat(tv, "scaleY", 0, 2);


        animator.setInterpolator(new LinearInterpolator());
        animator.setRepeatCount(-1);
        animator.setRepeatMode(ObjectAnimator.RESTART);
        animator.setDuration(1000);
        animator.start();

    }



    private void doPointViewAnimation(){

        ObjectAnimator animator = ObjectAnimator.ofInt(mPointView, "pointRadius", 0, 300, 100);
        animator.setDuration(2000);
        animator.start();
    }


    private void doBackgroundColorAnimation(){
        ObjectAnimator animator = ObjectAnimator.ofInt(tv, "BackgroundColor", 0xffff00ff, 0xffffff00, 0xffff00ff);
        animator.setDuration(8000);
        animator.setEvaluator(new ArgbEvaluator());
        animator.start();
    }

}
