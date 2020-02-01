package com.restaurant.proposalayu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.restaurant.proposalayu.fragments2.MateriDua2Activity;
import com.restaurant.proposalayu.fragments2.MateriDua3Activity;
import com.restaurant.proposalayu.fragments2.MateriDuaActivity;
import com.restaurant.proposalayu.fragments4.MateriEmpat2Activity;
import com.restaurant.proposalayu.fragments4.MateriEmpat3Activity;
import com.restaurant.proposalayu.fragments4.MateriEmpatActivity;

import java.util.ArrayList;
import java.util.List;

public class PosisiActivity extends AppCompatActivity {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posisi);

        List<Fragment> list = new ArrayList<>();
        list.add(new MateriEmpatActivity());
        list.add(new MateriEmpat2Activity());
        list.add(new MateriEmpat3Activity());


        pager = findViewById(R.id.pager_posisi);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(), list);

        pager.setAdapter(pagerAdapter);

    }
}
