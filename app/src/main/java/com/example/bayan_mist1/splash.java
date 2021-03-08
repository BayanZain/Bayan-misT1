package com.example.bayan_mist1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {

    float seconds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(splash.this,MainActivity.class));
                seconds+=0.1; updatecount();
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,5000);

    }
    void updatecount() { TextView t = (TextView)findViewById(R.id.timer);
        t.setText("Score: 10 - Time: "+seconds+" seconds");
        t.postInvalidate();
    }
}