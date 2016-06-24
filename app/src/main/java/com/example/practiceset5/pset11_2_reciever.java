package com.example.practiceset5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by syedaamir on 24-06-2016.
 */
public class pset11_2_reciever extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Now in Airplane Mode", Toast.LENGTH_SHORT).show();
    }
}
