package com.example.practiceset5;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pset18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pset18);
        final SharedPreferences pref = getSharedPreferences("My preferences",MODE_PRIVATE);
        Button btnsave = (Button)findViewById(R.id.pset18_btnsave);
        Button btnload = (Button)findViewById(R.id.pset18_btnload);
        final TextView tv =(TextView)findViewById(R.id.pset18_txtview);
        tv.setText(pref.getString("Name", "NAME NOT FOUND"));
        btnload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nam = pref.getString("Name", "NAME NOT FOUND");
                tv.setText(nam);
            }
        });

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("Name", "Summer of Code");
                editor.commit();
            }
        });
    }
}
