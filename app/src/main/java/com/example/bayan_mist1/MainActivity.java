package com.example.bayan_mist1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer lionMP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView lion = (ImageView)findViewById(R.id.imageView);

        lionMP = new MediaPlayer();
        lionMP = MediaPlayer.create(this, R.raw.lion);

        Button act2 =(Button)findViewById(R.id.act2F1);
        Button act3 =(Button)findViewById(R.id.act3F1);


        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });
        act3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity3.class));
            }
        });

        lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lionMP.start();
            }
        });
    }
    }
