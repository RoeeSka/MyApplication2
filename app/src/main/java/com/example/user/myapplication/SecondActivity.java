package com.example.user.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Context context = getApplicationContext();
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.activity_second);
        SharedPreferences sp, bc;
        SharedPreferences.Editor editor;
        sp = context.getSharedPreferences(MainActivity.PREF_NAME, Context.MODE_PRIVATE);
        bc = context.getSharedPreferences(MainActivity.PREF_BC, Context.MODE_PRIVATE);
        TextView textView = (TextView) findViewById(R.id.tv_settings);
        textView.setText(sp.getString(MainActivity.PREF_KEY, "Not found"));
        TextView textView2 = (TextView) findViewById(R.id.textView3);
        textView2.setText(sp.getString(MainActivity.PREF_BC, "Not found"));
        if (textView2.getText() == "Red"){
            rl.setBackgroundColor(Color.RED);
        }else if(textView2.getText() == "Green"){
            rl.setBackgroundColor(Color.GREEN);
        }else if(textView2.getText() == "Blue"){
            rl.setBackgroundColor(Color.BLUE);
        }
    }
}
