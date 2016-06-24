package com.example.practiceset5;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class pset11 extends AppCompatActivity {

    EditText editText1;
    EditText editText2;

    BroadcastReceiver brsent;
    Intent intesent;
    PendingIntent pisent;
    IntentFilter infsent;
    String sms_sent="Message sent";

    BroadcastReceiver brdel;
    Intent intedel;
    PendingIntent pidel;
    IntentFilter infdel;
    String sms_del="Message delivered";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pset11);
        intesent=new Intent(sms_sent);
        pisent=PendingIntent.getBroadcast(getApplicationContext(),0,intesent,0);
        infsent=new IntentFilter(sms_sent);

        intedel=new Intent(sms_del);
        pidel=PendingIntent.getBroadcast(getApplicationContext(),0,intedel,0);
        infdel=new IntentFilter(sms_del);

        brsent=new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                switch (getResultCode())
                {
                    case RESULT_OK:
                        Toast.makeText(getApplicationContext(),"SMS_SENT",Toast.LENGTH_SHORT).show();
                        break;
                    case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
                        break;
                    default:
                }
            }
        };

        brdel=new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                switch (getResultCode())
                {
                    case RESULT_OK:
                        Toast.makeText(getApplicationContext(),"SMS_DELIVERED",Toast.LENGTH_SHORT).show();
                        break;
                    case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
                        break;
                    default:
                }
            }
        };
    }
    protected void onResume()
    {
        super.onResume();
        registerReceiver(brsent,infsent);
        registerReceiver(brdel,infdel);
    }
    protected void onPause()
    {
        super.onPause();
        unregisterReceiver(brsent);
        unregisterReceiver(brdel);
    }

    public void SendSMS(View view) {
        editText1 = (EditText)findViewById(R.id.editTextReceiversNo);
        editText2 = (EditText)findViewById(R.id.editTextMessage);
        String mobileNumber = editText1.getText().toString();
        String message = editText2.getText().toString();
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(mobileNumber, null, message, null, null);
        Toast.makeText(getApplicationContext(),"SMS_SENT",Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),"SMS_DELIVERED",Toast.LENGTH_SHORT).show();
    }

}
