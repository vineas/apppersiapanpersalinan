package com.restaurant.proposalayu.fragments6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.restaurant.proposalayu.ListMateri;
import com.restaurant.proposalayu.MitosActivity;
import com.restaurant.proposalayu.PengertianActivity;
import com.restaurant.proposalayu.PersiapanActivity;
import com.restaurant.proposalayu.PosisiActivity;
import com.restaurant.proposalayu.R;

public class MateriEnamActivity extends AppCompatActivity {

    ImageButton kal1, kal2, kal3, kal4;

    private void initBinding() {
        kal1 = findViewById(R.id.kala_1);
        kal2 = findViewById(R.id.kala_2);
        kal3 = findViewById(R.id.kala_3);
        kal4 = findViewById(R.id.kala_4);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_6);
        initBinding();

        kal1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MateriEnamActivity.this, KalaSatuActivity.class);
                startActivity(intent);
            }
        });

        kal2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MateriEnamActivity.this, KalaDuaActivity.class);
                startActivity(intent);
            }
        });

        kal3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MateriEnamActivity.this, KalaTigaActivity.class);
                startActivity(intent);
            }
        });

        kal4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MateriEnamActivity.this, KalaEmpatActivity.class);
                startActivity(intent);
            }
        });
    }
}