package com.take_photo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android_view.R;

public class TakingPhotoChooseActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_activity, btn_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taking_photo);

        btn_activity = findViewById(R.id.btn_activity);
        btn_fragment = findViewById(R.id.btn_fragment);
        btn_activity.setOnClickListener(this);
        btn_fragment.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_activity:
                intent = new Intent(TakingPhotoChooseActivity.this, TakingPhotoActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_fragment:
                intent = new Intent(TakingPhotoChooseActivity.this, PhotoFragmentActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}
