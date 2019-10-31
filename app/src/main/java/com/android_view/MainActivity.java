package com.android_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android_view.basic_anim.AttributeAnimationActivity;
import com.android_view.basic_anim.BasicAnimActivity;
import com.take_photo.TakingPhotoActivity;
import com.take_photo.TakingPhotoChooseActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_basic_anim).setOnClickListener(this);
        findViewById(R.id.btn_attribute_anim).setOnClickListener(this);
        findViewById(R.id.btn_photo).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_basic_anim:
                startActivity(new Intent(MainActivity.this, BasicAnimActivity.class));
                break;
            case R.id.btn_attribute_anim:
                startActivity(new Intent(MainActivity.this, AttributeAnimationActivity.class));
                break;
            case R.id.btn_photo:
                startActivity(new Intent(MainActivity.this, TakingPhotoChooseActivity.class));
                break;
        }
    }
}
