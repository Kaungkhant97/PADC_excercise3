package com.kaungkhantthu.padcexercise3.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kaungkhantthu.padcexercise3.adapter.DividerItemDecoration;
import com.kaungkhantthu.padcexercise3.R;
import com.kaungkhantthu.padcexercise3.data.jobVO;
import com.kaungkhantthu.padcexercise3.adapter.jobadapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Jobsearch_Fragment extends Fragment {


    private static final String TAG = "Jobsearch_Fragment";

    public Jobsearch_Fragment() {
        // Required empty public constructor
    }

    public static Jobsearch_Fragment newInstance() {
        Log.e(TAG, "new instance: ");

        Jobsearch_Fragment fragment = new Jobsearch_Fragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e(TAG, "onCreateView: ");
        View v = inflater.inflate(R.layout.fragment_jobsearch, container, false);

        RecyclerView jobsrecyclerView = (RecyclerView) v.findViewById(R.id.joblist);
        jobsrecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        jobadapter adapter = new jobadapter(getDatalist());
        jobsrecyclerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL_LIST));
        jobsrecyclerView.setAdapter(adapter);
        return v;
    }

    private ArrayList<jobVO> getDatalist() {
        ArrayList<jobVO> jobVOArrayList = new ArrayList<>();
        jobVOArrayList.add(new jobVO("Developer/Senior Developer",
                "Standard Charted Bank", "Singapore", R.drawable.standardcharted, "new"));

        jobVOArrayList.add(new jobVO("Client Partner,Mobile Publisher Sales-Japan", "Facebook",
                        "Singapore", R.drawable.facebookicon, "3w"));

        jobVOArrayList.add(new jobVO("SAP Partner Solution Center Head for APJ & Greater China",
                "SAP","Singapore-01",R.drawable.sap,"3w"));
        jobVOArrayList.add(new jobVO("Technical Architect - Marketing Cloud",
                "salesforce.com","Singapore",R.drawable.iconsalesforce,"1w"));

        return jobVOArrayList;
    }

}
