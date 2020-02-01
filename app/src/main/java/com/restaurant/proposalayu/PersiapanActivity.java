package com.restaurant.proposalayu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.restaurant.proposalayu.fragments.AdatActivity;
import com.restaurant.proposalayu.fragments.FinancialActivity;
import com.restaurant.proposalayu.fragments.Fisik2Activity;
import com.restaurant.proposalayu.fragments.FisikActivity;
import com.restaurant.proposalayu.fragments.MateriSatu2Activity;
import com.restaurant.proposalayu.fragments.MateriSatu3Activity;
import com.restaurant.proposalayu.fragments.MateriSatu4Activity;
import com.restaurant.proposalayu.fragments.MateriSatu5Activity;
import com.restaurant.proposalayu.fragments.MateriSatu6Activity;
import com.restaurant.proposalayu.fragments.MateriSatuActivity;
import com.restaurant.proposalayu.fragments.Psikologis2Activity;
import com.restaurant.proposalayu.fragments.PsikologisActivity;

import java.util.ArrayList;
import java.util.List;

public class PersiapanActivity extends AppCompatActivity {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persiapan);

        List<Fragment> list = new ArrayList<>();
        list.add(new MateriSatuActivity());
        list.add(new MateriSatu3Activity());
        list.add(new MateriSatu4Activity());
        list.add(new MateriSatu5Activity());
        list.add(new MateriSatu6Activity());
        list.add(new MateriSatu2Activity());
        list.add(new FisikActivity());
        list.add(new Fisik2Activity());
        list.add(new PsikologisActivity());
        list.add(new Psikologis2Activity());
        list.add(new FinancialActivity());
        list.add(new AdatActivity());


        pager = findViewById(R.id.pager_persiapan);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(), list);

        pager.setAdapter(pagerAdapter);

    }
}
