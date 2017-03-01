package com.example.administrator.mvp01.service.presenter;

import android.content.Intent;

import com.example.administrator.mvp01.service.view.View;

/**
 * Created by Administrator on 2017/2/28.
 */

public interface Presenter {
    void onCreate();

    void onStart();//暂时没用到

    void onStop();

    void pause();//暂时没用到

    void attachView(View view);

    void attachIncomingIntent(Intent intent);//暂时没用到
}