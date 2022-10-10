package com.my.first.pianogrupo02;

import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

=======
import android.os.Bundle;

>>>>>>> 3cbf9cc (initial commit)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
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
=======
>>>>>>> 3cbf9cc (initial commit)
    }
}