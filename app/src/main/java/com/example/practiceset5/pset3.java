package com.example.practiceset5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by syedaamir on 21-06-2016.
 */
public class pset3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pset3_main);

        if(getResources().getDisplayMetrics().widthPixels > getResources().getDisplayMetrics().heightPixels)
        {
            Toast.makeText(this, "Landscape Mode", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Portrait Mode", Toast.LENGTH_LONG).show();
        }

    }

    public void callaction(View v){
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setAction(Intent.ACTION_DIAL);
        startActivity(i);
    }
    public void webaction(View v){
        Intent i = new Intent();
        i.setData(Uri.parse("http://design.google.com"));
        startActivity(Intent.createChooser(i,"open URL"));
    }

    public void locationaction(View v){

    }
}