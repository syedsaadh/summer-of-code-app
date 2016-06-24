package com.example.practiceset5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class day3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day3);
        Button b1 = (Button) findViewById(R.id.pset4_btn);
        b1.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      Intent intent = new Intent(day3.this, pset4.class);
                                      startActivity(intent);
                                  }
                              }
        );
        Button b2 = (Button) findViewById(R.id.pset5_btn);
        b2.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      Intent intent = new Intent(day3.this, pset5.class);
                                      startActivity(intent);
                                  }
                              }
        );
    }
}
