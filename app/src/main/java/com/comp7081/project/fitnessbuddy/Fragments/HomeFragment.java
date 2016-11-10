package com.comp7081.project.fitnessbuddy.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.comp7081.project.fitnessbuddy.Activities.DairyActivity;
import com.comp7081.project.fitnessbuddy.R;

/**
 * Created by danny on 2016-11-03.
 */

public class HomeFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;
    Button btnDairy, btnFruits, btnMeat, btnGrains, btnVegetables, btnConfections;
    public static HomeFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment_page, container, false);

        btnDairy = (Button) view.findViewById(R.id.btnDairy);
        btnFruits = (Button) view.findViewById(R.id.btnFruits);
        btnMeat = (Button) view.findViewById(R.id.btnMeat);
        btnGrains = (Button) view.findViewById(R.id.btnGrains);
        btnVegetables = (Button) view.findViewById(R.id.btnVegetables);
        btnConfections = (Button) view.findViewById(R.id.btnConfections);

        btnDairy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DairyActivity.class);
                startActivity(i);
            }
        });

        return view;
    }


}
