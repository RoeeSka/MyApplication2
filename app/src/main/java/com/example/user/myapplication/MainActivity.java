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
    public final static String PREF_BC_KEY = "KEY";
    public final static String PREF_BC = "SETTINGS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();


        SharedPreferences sp, bc;
        final SharedPreferences.Editor editor, editorBC;
        sp = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        bc = context.getSharedPreferences(PREF_BC, Context.MODE_PRIVATE);
        editor = sp.edit();
        editor.putString(PREF_KEY,"Hello");
        editor.commit();
        editorBC = bc.edit();
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editorBC.putString(PREF_BC,"Red");
                editorBC.commit();
            }
        });
        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editorBC.putString(PREF_BC,"Green");
                editorBC.commit();
            }
        });
        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editorBC.putString(PREF_BC,"Blue");
                editorBC.commit();
            }
        });
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
