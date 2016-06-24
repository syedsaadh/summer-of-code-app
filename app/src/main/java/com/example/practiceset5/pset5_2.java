package com.example.practiceset5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class pset5_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pset5_2);

        Bundle mainData = getIntent().getExtras();
        if (mainData == null){
            return;
        }
        String Message = mainData.getString("message").toString();
        TextView t = (TextView) findViewById(R.id.responseTextView);
        t.setText(Message);
    }

}
