package com.example.practiceset5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class pset6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pset6);
    }
    public int x = 0;
    public  void changeImgFunc(View v){
        ImageView i = (ImageView)findViewById(R.id.pset6ImageView);
        if(x == 0 )
        {   x=1;
            i.setImageResource(R.drawable.parrotdesignphotoshop);
        }
        else
        {  x=0;  
            i.setImageResource(R.drawable.designspecs);}
        ;
    }
}
