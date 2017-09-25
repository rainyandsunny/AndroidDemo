package com.yuntu.demo.servicedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jump(View view){

        Intent intent = new Intent(MainActivity.this,MyService.class);
        startService(intent);
    }

    public void jumpActivityB(View view){

        Intent intent = new Intent(MainActivity.this,BActivity.class);
        startActivity(intent);
    }
}
