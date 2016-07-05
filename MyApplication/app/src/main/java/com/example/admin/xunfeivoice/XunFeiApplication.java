package com.example.admin.xunfeivoice;

import android.app.Application;

import com.iflytek.cloud.SpeechUtility;

/**
 * Created by admin on 2016/7/5.
 */
public class XunFeiApplication extends Application {

    @Override
    public void onCreate() {
        SpeechUtility.createUtility(XunFeiApplication.this, "appid=" + getString(R.string.app_id));
        super.onCreate();
    }
}
