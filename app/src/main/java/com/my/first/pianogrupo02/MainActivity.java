package com.my.first.pianogrupo02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimerTask tm = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Piano_tradicional.class);
                startActivity(intent);
                finish();

            }
        };

        Timer time = new Timer();
        time.schedule(tm,3000);
    }
}