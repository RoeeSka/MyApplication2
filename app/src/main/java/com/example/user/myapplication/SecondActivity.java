package com.example.user.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Context context = getApplicationContext();
        SharedPreferences sp;
        SharedPreferences.Editor editor;
        sp = context.getSharedPreferences(MainActivity.PREF_NAME, Context.MODE_PRIVATE);
        TextView textView = (TextView) findViewById(R.id.tv_settings);
        textView.setText(sp.getString(MainActivity.PREF_KEY, "Not found"));
    }
}
