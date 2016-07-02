package com.kaungkhantthu.padcexercise3.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kaungkhantthu.padcexercise3.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Linkedin_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Linkedin_Fragment extends Fragment {


    private static final String TAG = "Linkedin_Fragment";

    public Linkedin_Fragment() {
        // Required empty public constructor
    }

    public static Linkedin_Fragment newInstance() {
        Log.e(TAG, "new instance: " );

        Linkedin_Fragment fragment = new Linkedin_Fragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e(TAG, "onCreateView: " );
       View v = inflater.inflate(R.layout.fragment_linkedin_, container, false);


        return v;

    }

}
