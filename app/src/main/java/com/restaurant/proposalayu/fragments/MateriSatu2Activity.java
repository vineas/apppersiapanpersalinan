package com.restaurant.proposalayu.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.restaurant.proposalayu.R;

public class MateriSatu2Activity extends Fragment {
    ImageButton fisik, financial, psikologis, adat;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.activity_materi_12, container
                        , false);

        return rootView;
    }

//    private void initBinding() {
//        fisik = fisik.findViewById(R.id.ib_fisik);
//        financial = financial.findViewById(R.id.ib_financial);
//        psikologis = psikologis.findViewById(R.id.ib_psikologis);
//        adat = adat.findViewById(R.id.ib_adat);
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        initBinding();
//
//        adat.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Intent intent = new Intent(MateriSatu2Activity.this.getActivity(), AdatActivity.class);
//                startActivity(intent);
//                }
//        });
//    }
//
}