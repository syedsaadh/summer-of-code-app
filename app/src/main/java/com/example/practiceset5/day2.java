package com.example.practiceset5;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class day2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2);
        Button b1 = (Button) findViewById(R.id.pset2_btn);
        b1.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      Intent intent = new Intent(day2.this, pset2.class);
                                      startActivity(intent);
                                  }
                              }
        );
        Button b2 = (Button) findViewById(R.id.pset3_btn);
        b2.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      Intent intent = new Intent(day2.this, pset3.class);
                                      startActivity(intent);
                                  }
                              }
        );
    }
}
