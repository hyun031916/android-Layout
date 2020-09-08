package com.cookandroid.android_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button)findViewById(R.id.b1);
//        TextView t1 = (TextView)findViewById(R.id.tv1);
//        CheckBox cb1 = (CheckBox) findViewById(R.id.cb1);
//        RadioButton rb1 = (RadioButton)findViewById(R.id.rb1);
//        Switch s1 = (Switch)findViewById(R.id.s1);
        Button b2 = (Button)findViewById(R.id.b2);
        Button b3 = (Button)findViewById(R.id.b3);
    }
}