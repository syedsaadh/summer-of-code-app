package com.example.practiceset5;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class pset9 extends AppCompatActivity {

    TextToSpeech tts;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pset9);

        tts = new TextToSpeech(getApplicationContext(),new TextToSpeech.OnInitListener(){
            @Override
            public void onInit(int states) {
                if (tts != null) {
                    tts.setLanguage(Locale.getDefault());
                    tts.setPitch(1.0f);
                    tts.setSpeechRate(1.0f);
                } else
                {
                    Toast.makeText(getApplicationContext(),"No Device",Toast.LENGTH_LONG);
                }
        }});

        tts.speak("Hello Buddy , How are You ? What do you want me to speak ?",TextToSpeech.QUEUE_FLUSH,null);

    }

    public void avatarSpeak(View v){
        ed = (EditText)findViewById(R.id.pset9editText);
        TextView t = (TextView)findViewById(R.id.avatarResponse);
        t.setText(ed.getText().toString());
        tts.speak(ed.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
    }
}
