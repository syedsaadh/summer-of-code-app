package com.example.practiceset5;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by syedaamir on 28-06-2016.
 */
public class pset15_bottomfragment extends Fragment {
    TextView textView1;
    TextView textView2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_pset15_fragment_bottom, container, false);
        textView1 = (TextView) v.findViewById(R.id.pset15_textView);
        textView2 = (TextView) v.findViewById(R.id.pset15_textView2);
        return v;
    }

    public void setMSGText(String Top, String Bottom) {
        textView1.setText(Top);
        textView2.setText(Bottom);
    }
}
