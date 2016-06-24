package com.example.practiceset5;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by syedaamir on 21-06-2016.
 */
public class pset1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pset1_main);
        Button btn = (Button)findViewById(R.id.click_meBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Snackbar.make(v, "You Just Clicked Me", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
    public void onStart() {
        Toast.makeText(this, "On Start", Toast.LENGTH_LONG).show();
        Log.i("Message", "On Start");
        super.onStart();
    }

    public void onResume() {
        Toast.makeText(this, "On Resume", Toast.LENGTH_LONG).show();
        Log.i("Message", "On Resume");
        super.onResume();
    }

    public void onPause() {
        Toast.makeText(this, "On Pause", Toast.LENGTH_LONG).show();
        Log.i("Message", "On Pause");
        super.onPause();
    }

    public void onStop() {
        Toast.makeText(this, "On Stop", Toast.LENGTH_LONG).show();
        Log.i("Message", "On Stop");
        super.onStop();
    }
}