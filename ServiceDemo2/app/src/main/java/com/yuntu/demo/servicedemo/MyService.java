package com.yuntu.demo.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private static final String TAG = "MyService";
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {

        Log.d(TAG,"onBind");
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * 第一次启动的时候会调用
     */
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"onCreate");
    }

    /**
     * 每次启动都会调用
     * @param intent
     * @param flags
     * @param startId
     * @return
     */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.d(TAG,"onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
}
