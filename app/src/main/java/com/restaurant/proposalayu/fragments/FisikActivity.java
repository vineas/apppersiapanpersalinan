package com.restaurant.proposalayu.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.restaurant.proposalayu.R;

public class FisikActivity extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.activity_fisik_1_materi, container
                        , false);

        return rootView;
    }
}