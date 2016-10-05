package com.example.rafael.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer sound1;
    MediaPlayer sound2;
    MediaPlayer sound3;
    MediaPlayer sound4;

    public void plays1(View view) {
        sound1.start();
    }
    public void plays2(View view) {
        sound2.start();
    }
    public void plays3(View view) {
        sound3.start();
    }
    public void plays4(View view) {
        sound4.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sound1 = MediaPlayer.create(this, R.raw.bike);
        sound2 = MediaPlayer.create(this, R.raw.gong);
        sound3 = MediaPlayer.create(this, R.raw.gun);
        sound4 = MediaPlayer.create(this, R.raw.nade);


    }
}
