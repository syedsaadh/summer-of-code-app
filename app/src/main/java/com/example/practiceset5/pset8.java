package com.example.practiceset5;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class pset8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pset8);


    }
    public void playMovie(View view){
        Uri ur = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.barbiegirlsong) ;
        VideoView v = (VideoView)findViewById(R.id.pset8VideoView);
        v.setVideoURI(ur);
        v.setMediaController(new MediaController(this));
        v.requestFocus();
        v.start();
    }


}
