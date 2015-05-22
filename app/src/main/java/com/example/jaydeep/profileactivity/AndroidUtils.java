package com.example.jaydeep.profileactivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;

public class AndroidUtils {

    public static boolean isAboveL() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }

    @SuppressLint("NewApi")
    public static void setStatusBarColor(Activity activity, int color) {
        if (isAboveL()) {
            activity.getWindow().setStatusBarColor(color);
        }
    }
}
