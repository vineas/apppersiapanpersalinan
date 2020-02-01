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
import com.restaurant.proposalayu.fragments5.MateriLima2Activity;
import com.restaurant.proposalayu.fragments5.MateriLima3Activity;
import com.restaurant.proposalayu.fragments5.MateriLima4Activity;
import com.restaurant.proposalayu.fragments5.MateriLimaActivity;

import java.util.ArrayList;
import java.util.List;

public class TipsActivity extends AppCompatActivity {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        List<Fragment> list = new ArrayList<>();
        list.add(new MateriLimaActivity());
        list.add(new MateriLima2Activity());
        list.add(new MateriLima3Activity());
        list.add(new MateriLima4Activity());


        pager = findViewById(R.id.pager_tips);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(), list);

        pager.setAdapter(pagerAdapter);

    }
}
