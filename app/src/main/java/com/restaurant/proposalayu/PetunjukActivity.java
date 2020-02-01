package com.restaurant.proposalayu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.restaurant.proposalayu.fragments3.MateriTiga2Activity;
import com.restaurant.proposalayu.fragments3.MateriTigaActivity;
import com.restaurant.proposalayu.info.Info1;
import com.restaurant.proposalayu.info.Info2;
import com.restaurant.proposalayu.petunjuk.Petunjuk1;
import com.restaurant.proposalayu.petunjuk.Petunjuk2;
import com.restaurant.proposalayu.petunjuk.Petunjuk3;

import java.util.ArrayList;
import java.util.List;

public class PetunjukActivity extends AppCompatActivity {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petunjuk);

        List<Fragment> list = new ArrayList<>();
        list.add(new Petunjuk1());
        list.add(new Petunjuk2());
        list.add(new Petunjuk3());

        pager = findViewById(R.id.pager_petunjuk);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(), list);

        pager.setAdapter(pagerAdapter);

    }
}