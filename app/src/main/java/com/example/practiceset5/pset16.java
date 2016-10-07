package com.example.practiceset5;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class pset16 extends AppCompatActivity {
    ActionBar ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pset16);
        ab=getActionBar();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.pset16_men, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_contact) {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:121"));
            startActivity(i);
        }
        if(id == R.id.action_faq){
            Toast.makeText(getApplicationContext(),"FAQ",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
