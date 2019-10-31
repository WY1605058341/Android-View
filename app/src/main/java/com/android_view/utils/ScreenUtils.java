package com.android_view.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;

public class ScreenUtils {

    public static final String TAG = "WY";



    public static void getScreenSize(Activity activity) {




        //1、通过WindowManager获取
        WindowManager manager = activity.getWindowManager();


        DisplayMetrics outMetrics = new DisplayMetrics();
        manager.getDefaultDisplay().getMetrics(outMetrics);
        int width = outMetrics.widthPixels;
        int height = outMetrics.heightPixels;


        Log.i(TAG, "Method 1: height::" + height + "  width::" + width);

        //2、通过Resources获取
        DisplayMetrics dm1 = activity.getResources().getDisplayMetrics();
        int height1 = dm1.heightPixels;
        int width1 = dm1.widthPixels;
        Log.i(TAG, "Method 2: height::" + height1 + "  width::" + width1);

        //3、获取屏幕的默认分辨率
        Display display = activity.getWindowManager().getDefaultDisplay();
        int height2 = display.getWidth();
        int width2 = display.getHeight();
        Log.i(TAG, "Method 3: height::" + height2 + "  width::" + width2);//Method 3: height::1080  width::1920
    }

}
