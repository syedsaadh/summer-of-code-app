package com.example.practiceset5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class day6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day6);
        Button b1 = (Button) findViewById(R.id.pset12_btn);
        b1.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      Intent intent = new Intent(day6.this, pset12.class);
                                      startActivity(intent);
                                  }
                              }
        );
        Button b2 = (Button) findViewById(R.id.pset13_btn);
        b2.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      Intent intent = new Intent(day6.this, pset13.class);
                                      startActivity(intent);
                                  }
                              }
        );
    }
}
