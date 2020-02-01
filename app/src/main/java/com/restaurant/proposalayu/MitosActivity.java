package com.restaurant.proposalayu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.restaurant.proposalayu.fragments2.MateriDua2Activity;
import com.restaurant.proposalayu.fragments2.MateriDua3Activity;
import com.restaurant.proposalayu.fragments2.MateriDuaActivity;

import java.util.ArrayList;
import java.util.List;

public class MitosActivity extends AppCompatActivity {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mitos);

        List<Fragment> list = new ArrayList<>();
        list.add(new MateriDuaActivity());
        list.add(new MateriDua2Activity());
        list.add(new MateriDua3Activity());


        pager = findViewById(R.id.pager_mitos);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(), list);

        pager.setAdapter(pagerAdapter);

    }
}
