package com.example.practiceset5;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by syedaamir on 28-06-2016.
 */
public class pset15_topfragment extends Fragment {
    EditText editText1;
    EditText editText2;
    Button button;

    TopSelectionListener activityCommander;
    public interface TopSelectionListener {
        public void createMSG(String Top, String Bottom);
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommander = (TopSelectionListener) activity;
        }
        catch(ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_pset15_fragment_top, container, false);
        editText1 = (EditText) v.findViewById(R.id.editText1);
        editText2 = (EditText) v.findViewById(R.id.editText2);
        button = (Button) v.findViewById(R.id.pset15_Login_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });

        return v;
    }

    public void buttonClicked(View view) {
        activityCommander.createMSG(editText1.getText().toString(), editText2.getText().toString());
    }

}

