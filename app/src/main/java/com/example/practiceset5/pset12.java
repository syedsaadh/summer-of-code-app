package com.example.practiceset5;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pset12 extends AppCompatActivity {

    NotificationCompat.Builder notif;
    private static final int UniqueId = 456;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pset12);

        notif = new NotificationCompat.Builder(this);
        notif.setAutoCancel(true);

    }
    public void showme(View v){
        notif.setSmallIcon(R.drawable.ic_stat_like);
        notif.setWhen(System.currentTimeMillis());
        notif.setContentTitle("Pastime");
        notif.setContentText("New Post from Swastik on pastime!!");
        Intent i = new Intent(pset12.this,pset12.class);
        PendingIntent pi = PendingIntent.getActivity(this,0,i,PendingIntent.FLAG_UPDATE_CURRENT);
        notif.setContentIntent(pi);
        NotificationManager nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        nm.notify(UniqueId,notif.build());
    }
}
