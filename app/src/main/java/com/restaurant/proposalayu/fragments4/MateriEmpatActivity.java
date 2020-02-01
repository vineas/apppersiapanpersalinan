package com.restaurant.proposalayu.fragments4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.restaurant.proposalayu.R;

public class MateriEmpatActivity extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.activity_materi_4, container
                        , false);

        return rootView;
    }
}