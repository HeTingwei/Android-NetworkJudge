package com.xingyi.testall;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

/**
 * Created by HeTingwei on 2017/9/2.
 */

public class MyApplication extends Application {

    public int a=0;

    public void dialog(Context context){
        AlertDialog.Builder builder=new AlertDialog.Builder(context);
        builder.setTitle("123");
        builder.setMessage("31");
        builder.setPositiveButton("是", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.show();
    }
}
