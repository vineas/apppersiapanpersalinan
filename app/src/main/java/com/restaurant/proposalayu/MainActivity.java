package com.restaurant.proposalayu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    ImageButton bt_list, bt_pet, bt_inf;

    private void initBinding() {

        bt_list = findViewById(R.id.bt_list);
        bt_pet = findViewById(R.id.bt_pet);
        bt_inf = findViewById(R.id.bt_inf);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBinding();

        bt_list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListMateri.class);
                startActivity(intent);
            }
        });

        bt_pet.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PetunjukActivity.class);
                startActivity(intent);
            }
        });
        bt_inf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });

    }



}