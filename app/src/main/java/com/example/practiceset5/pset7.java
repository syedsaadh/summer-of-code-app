package com.example.practiceset5;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class pset7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pset7);
    }
    public int m1=0;
    public int m2=0;
    public int m3=0;
    public int m4=0;
    public void playmusic1(View v){
        MediaPlayer mp = MediaPlayer.create(pset7.this,R.raw.a2b3);
        if(m1==0){
            mp.start();
            m1=1;
        }
        else
        {
            mp.stop();
            m1=0;
        }

    }
    public void playmusic2(View v){
        MediaPlayer mp = MediaPlayer.create(pset7.this,R.raw.b2b3);
        if(m2==0){
            mp.start();
            m2=1;
        }
        else
        {
            mp.stop();
            m2=0;
        }

    }
    public void playmusic3(View v){
        MediaPlayer mp = MediaPlayer.create(pset7.this,R.raw.c2b3);
        if(m3==0){
            mp.start();
            m3=1;
        }
        else
        {
            mp.stop();
            m3=0;
        }

    }
    public void playmusic4(View v){
        MediaPlayer mp = MediaPlayer.create(pset7.this,R.raw.d2b3);
        if(m4==0){
            mp.start();
            m4=1;
        }
        else
        {
            mp.stop();
            m4=0;
        }

    }

}
