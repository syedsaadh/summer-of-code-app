package com.example.practiceset5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pset4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pset4);
    }
    public void opendial(View v){
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setAction(Intent.ACTION_DIAL);
        startActivity(i);
    }
    public void openweb(View v){
        Intent i = new Intent();
        i.setData(Uri.parse("http://google.com"));
        startActivity(Intent.createChooser(i,"open URL"));
    }

    public void callnum(View v){
        Intent i = new Intent();
        i.setAction(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:121"));
        startActivity(i);
    }


}
