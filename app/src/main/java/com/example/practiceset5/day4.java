package com.example.practiceset5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class day4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day4);
        Button b1 = (Button) findViewById(R.id.pset6_btn);
        b1.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      Intent intent = new Intent(day4.this, pset6.class);
                                      startActivity(intent);
                                  }
                              }
        );
        Button b2 = (Button) findViewById(R.id.pset7_btn);
        b2.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      Intent intent = new Intent(day4.this, pset7.class);
                                      startActivity(intent);
                                  }
                              }
        );
        Button b3 = (Button) findViewById(R.id.pset8_btn);
        b3.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      Intent intent = new Intent(day4.this, pset8.class);
                                      startActivity(intent);
                                  }
                              }
        );
        Button b4 = (Button) findViewById(R.id.pset9_btn);
        b4.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      Intent intent = new Intent(day4.this, pset9.class);
                                      startActivity(intent);
                                  }
                              }
        );
    }
}
