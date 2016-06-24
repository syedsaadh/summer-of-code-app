package com.example.practiceset5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class pset5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pset5);
    }
    public void openActivity(View v){
        Intent i = new Intent(this,pset5_2.class);
        final EditText ed =(EditText)findViewById(R.id.messageTextView);
        String umessage = ed.getText().toString();
        i.putExtra("message",umessage);
        startActivity(i);
    }
}
