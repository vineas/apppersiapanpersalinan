package com.restaurant.proposalayu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import com.restaurant.proposalayu.fragments6.MateriEnamActivity;

public class ListMateri extends AppCompatActivity {

   ImageButton mat1, mat2, mat3, mat4, mat5, mat6;

    private void initBinding() {
        mat1 = findViewById(R.id.materi1);
        mat2 = findViewById(R.id.materi2);
        mat3 = findViewById(R.id.materi3);
        mat4 = findViewById(R.id.materi4);
        mat5 = findViewById(R.id.materi5);
        mat6 = findViewById(R.id.materi6);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_materi);
        initBinding();

        mat1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(ListMateri.this, PersiapanActivity.class);
                startActivity(intent);
            }
        });

        mat2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(ListMateri.this, MitosActivity.class);
                startActivity(intent);
            }
        });

        mat3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(ListMateri.this, PengertianActivity.class);
                startActivity(intent);
            }
        });

        mat4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(ListMateri.this, PosisiActivity.class);
                startActivity(intent);
            }
        });

        mat5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(ListMateri.this, TipsActivity.class);
                startActivity(intent);
            }
        });

        mat6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(ListMateri.this, MateriEnamActivity.class);
                startActivity(intent);
            }
        });


    }

}
