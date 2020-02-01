package com.restaurant.proposalayu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.restaurant.proposalayu.fragments3.MateriTiga2Activity;
import com.restaurant.proposalayu.fragments3.MateriTigaActivity;

import java.util.ArrayList;
import java.util.List;

public class PengertianActivity extends AppCompatActivity {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengertian);

        List<Fragment> list = new ArrayList<>();
        list.add(new MateriTigaActivity());
        list.add(new MateriTiga2Activity());

        pager = findViewById(R.id.pager_pengertian);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(), list);

        pager.setAdapter(pagerAdapter);

    }
}
