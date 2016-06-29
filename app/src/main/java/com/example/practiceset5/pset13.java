package com.example.practiceset5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class pset13 extends AppCompatActivity {
    String array[] = new String[]{""};
    private static ListView lv;
    private static EditText ed;
    private static ArrayList<String> name = new ArrayList<>();;
    public static int cnt =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pset13);
        listView();
    }
    public void listView(){
        lv = (ListView)findViewById(R.id.listView);
        ArrayAdapter <String> adapter = new ArrayAdapter <String>(this,R.layout.activity_pset13_reminder_list,name);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String) lv.getItemAtPosition(position);
                Toast.makeText(pset13.this, "Position " + position + " Value : " + value, Toast.LENGTH_LONG).show();
            }
        });
    }
    public void addReminder(View v){
        name.add(cnt,ed.getText().toString());
        cnt++;
        Toast.makeText(pset13.this, ed.getText().toString(), Toast.LENGTH_LONG).show();
      //  listView();
    }
}
