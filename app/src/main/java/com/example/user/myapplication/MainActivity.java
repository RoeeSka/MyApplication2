package com.example.user.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public final static String PREF_KEY = "KEY";
    public final static String PREF_NAME = "SETTINGS";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();


        SharedPreferences sp;
        SharedPreferences.Editor editor;
        sp = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = sp.edit();
        editor.putString(PREF_KEY,"Hello");
        editor.commit();
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nika = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(nika);
            }
        });
    }
}
