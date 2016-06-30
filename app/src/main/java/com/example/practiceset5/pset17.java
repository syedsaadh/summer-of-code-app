package com.example.practiceset5;

        import android.database.Cursor;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;


public class pset17 extends AppCompatActivity {

    private EditText e1,e2,e3;
    Button b1,b2,b3,b4;
    TextView txtV;
    pset17_helperD myhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pset17);


        init();
        myhelper = new pset17_helperD(pset17.this);
    }

    private void init()
    {
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        e3 = (EditText)findViewById(R.id.editText3);

        b1=(Button)findViewById(R.id.pset18_btnsave);
        b2=(Button)findViewById(R.id.pset18_btnload);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);



        b1.setOnClickListener(dbButtonListener);
        b2.setOnClickListener(dbButtonListener);
        b3.setOnClickListener(dbButtonListener);
        b4.setOnClickListener(dbButtonListener);
        txtV = (TextView)findViewById(R.id.textViewdb);

    }

    private View.OnClickListener dbButtonListener = new View.OnClickListener()
    {


        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.pset18_btnsave:
                    long result = myhelper.insert(Integer.parseInt(e1.getText().toString().trim()) , e2.getText().toString() , e3.getText().toString());
                    if(result == -1)
                    {
                        Toast.makeText(getApplicationContext(),"Error", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(pset17.this, "its alright", Toast.LENGTH_SHORT).show();
                        showData();
                    }
                    break;
                case R.id.pset18_btnload:
                    myhelper.del(Integer.parseInt(e1.getText().toString()));
                    showData();
                    break;

                case R.id.button3:
                    myhelper.update(Integer.parseInt(e1.getText().toString().trim()) , e2.getText().toString() , e3.getText().toString());
                    showData();
                    break;
                case R.id.button4:
                    showData();
                    break;

            }

        }
    };
    public void showData() {
        StringBuffer finalData = new StringBuffer();
        Cursor cursor = myhelper.getAllRecords();
        finalData.append(" ID      |     Fname    |  Lname \n");
        for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
            finalData.append(cursor.getInt(cursor.getColumnIndex(myhelper.ID)));
            finalData.append("  | ");
            finalData.append(cursor.getString(cursor.getColumnIndex(myhelper.Fname)));
            finalData.append("  | ");
            finalData.append(cursor.getString(cursor.getColumnIndex(myhelper.Lname)));
            finalData.append("\n");
        }
        txtV.setText(finalData);
    }
    @Override
    protected void onStart() {
        super.onStart();
        myhelper.openDb();
    }

    @Override
    protected void onStop() {
        super.onStop();
        myhelper.closeDb();
    }
}
