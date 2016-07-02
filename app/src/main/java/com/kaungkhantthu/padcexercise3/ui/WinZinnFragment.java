package com.kaungkhantthu.padcexercise3.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kaungkhantthu.padcexercise3.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class WinZinnFragment extends Fragment {


    public static WinZinnFragment newInstance() {
        WinZinnFragment fragment = new WinZinnFragment();
        return  fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_win_zinn, container, false);
    }

}
