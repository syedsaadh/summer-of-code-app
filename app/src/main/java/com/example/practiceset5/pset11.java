package com.example.practiceset5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class pset11 extends AppCompatActivity {

    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pset11);

    }
    public void SendSMS(View view) {
        editText1 = (EditText)findViewById(R.id.editTextReceiversNo);
        editText2 = (EditText)findViewById(R.id.editTextMessage);
        String mobileNumber = editText1.getText().toString();
        String message = editText2.getText().toString();
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(mobileNumber, null, message, null, null);
    }

}
