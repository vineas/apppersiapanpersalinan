package com.restaurant.proposalayu.fragments5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.restaurant.proposalayu.R;

public class MateriLima3Activity extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.activity_materi_53, container
                        , false);

        return rootView;
    }
}