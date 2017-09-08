package com.xingyi.testall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: "+((MyApplication)getApplicationContext()).a);
        ((MyApplication)getApplicationContext()).a=1;
    }

    public void click(View v){
        ((MyApplication)getApplicationContext()).dialog(this);
    }
}
