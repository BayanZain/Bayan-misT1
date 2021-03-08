package com.example.bayan_mist1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class mac extends AppCompatActivity {

    MediaPlayer Song;
    int playing=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mac);

        Song = new MediaPlayer();
        Song = MediaPlayer.create(this, R.raw.track1);

        ImageView mac = (ImageView)findViewById(R.id.mac);

        mac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(playing){
                    case 0:
                        Song.start();
                        playing=1;
                        break;
                    case 1:
                        Song.pause();
                        playing=0;
                        break;
                }
            }
        });



    }
}