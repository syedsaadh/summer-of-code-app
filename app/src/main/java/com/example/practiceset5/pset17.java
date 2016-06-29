package com.example.practiceset5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pset17 extends AppCompatActivity {
    pset17_helperD myHelper;
    EditText ed_id;
    EditText ed_fnmae ;
    EditText ed_lname;
    EditText ed_address ;
    EditText ed_salary ;
    Button btn_insert;
    Button btn_delete;
    Button btn_update;
    Button btn_load ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        myHelper = new pset17_helperD(this);

    }

    public void init(){
        ed_id = (EditText)findViewById(R.id.pset17_id_input) ;
        ed_fnmae = (EditText)findViewById(R.id.pset17_fname_input) ;
        ed_lname = (EditText)findViewById(R.id.pset17_lname_input) ;
        ed_address = (EditText)findViewById(R.id.pset17_address_input) ;
        ed_salary = (EditText)findViewById(R.id.pset17_salary_input) ;
        btn_insert = (Button)findViewById(R.id.pset17_insert_btn);
        btn_delete = (Button)findViewById(R.id.pset17_delete_btn);
        btn_update = (Button)findViewById(R.id.pset17_update_btn);
        btn_load = (Button)findViewById(R.id.pset17_loadall_btn);
        btn_insert.setOnClickListener(dbButtonsListener);
        btn_delete.setOnClickListener(dbButtonsListener);
        btn_update.setOnClickListener(dbButtonsListener);
        btn_load.setOnClickListener(dbButtonsListener);

    }
    private View.OnClickListener dbButtonsListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case  R.id.pset17_insert_btn :
                    long result = myHelper.insert(Integer.parseInt(ed_id.getText().toString().trim()),ed_fnmae.getText().toString().trim(),ed_lname.getText().toString().trim(),ed_address.getText().toString().trim(),Integer.parseInt(ed_salary.getText().toString().trim()));
                    if(result==-1){
                        Toast.makeText(pset17.this, "Error inserting", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(pset17.this,"Inserted",Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.pset17_delete_btn :
                break;
                case R.id.pset17_update_btn :
                break;
                case R.id.pset17_loadall_btn :
                break;
            }
        }
    };
    protected void onStart(){
        super.onStart();
        myHelper.openDb();
    }

    protected void onStop(){
        super.onStop();
        myHelper.closeDb();
    }
}
