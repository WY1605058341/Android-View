package com.android_view.basic_anim;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;

import com.android_view.R;

public class PropertyValueActivity extends AppCompatActivity {


    private ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_value);
        iv = findViewById(R.id.iv);
        findViewById(R.id.btn_animation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPropertyValueHolder();
            }
        });
    }

    private void showPropertyValueHolder() {
        PropertyValuesHolder rotationHolder = PropertyValuesHolder.ofFloat("Rotation", 60f, -60f, 40f, -40f, -20f, 20f, 10f, -10f, 0f);
        PropertyValuesHolder colorHolder = PropertyValuesHolder.ofInt("BackgroundColor", 0xffffffff, 0xffff00ff, 0xffffff00, 0xffffffff);
        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(iv, rotationHolder, colorHolder);
        animator.setDuration(1000);
        animator.setRepeatCount(-1);
        animator.setInterpolator(new AccelerateInterpolator());
        animator.start();
    }
}
