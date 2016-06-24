package com.example.practiceset5;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by syedaamir on 21-06-2016.
 */
public class pset2 extends AppCompatActivity {

    public int ed1_val;
    public int ed2_val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pset2_main);

        final EditText ed1 = (EditText) findViewById(R.id.textBox1);
        final EditText ed2 = (EditText) findViewById(R.id.textBox2);
        final TextView Res = (TextView) findViewById(R.id.res_text);

        Button btn_add = (Button)findViewById(R.id.btn_add);
        Button btn_sub = (Button)findViewById(R.id.btn_sub);

        btn_add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ed1_val = Integer.parseInt(ed1.getText().toString());
                ed2_val = Integer.parseInt(ed2.getText().toString());
                int temp = ed1_val+ed2_val;
                Integer i = temp;
                Snackbar.make(v, "Addition = "+i.toString(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Res.setText(i.toString());
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#636161"));
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ed1_val = Integer.parseInt(ed1.getText().toString());
                ed2_val = Integer.parseInt(ed2.getText().toString());
                int temp = ed1_val-ed2_val;
                Integer i = temp;
                Snackbar.make(v, "Subtraction = " + i.toString(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Res.setText(i.toString());
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#5677fc"));
            }
        });

    }

}