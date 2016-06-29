package com.example.practiceset5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class pset15 extends AppCompatActivity  implements pset15_topfragment.TopSelectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pset15);
    }
    @Override
    public void createMSG(String Top, String Bottom) {
        pset15_bottomfragment bottomFragment = (pset15_bottomfragment) getFragmentManager().findFragmentById(R.id.fragmentbottom);
        bottomFragment.setMSGText(Top, Bottom);
    }
}
