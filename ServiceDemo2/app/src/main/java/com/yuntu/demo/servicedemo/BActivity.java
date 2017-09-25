package com.yuntu.demo.servicedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }

    public void jump(View view){

        Intent intent = new Intent(BActivity.this,MyService.class);
        startService(intent);
    }

}
