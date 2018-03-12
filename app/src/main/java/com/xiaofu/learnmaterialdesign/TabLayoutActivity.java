package com.xiaofu.learnmaterialdesign;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xiaofu.learnmaterialdesign.adapter.MyVpAdapter;
import com.xiaofu.learnmaterialdesign.fragment.FirstFragment;
import com.xiaofu.learnmaterialdesign.fragment.SecondFragment;
import com.xiaofu.learnmaterialdesign.fragment.ThirdFragment;

import java.util.ArrayList;
import java.util.List;

public class TabLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        // 只有第一个TabLayout与底部ViewPager有联动，其他的只是样式展示
        // 当然，你也可以使用FrameLayout+Fragment来实现
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager vp = findViewById(R.id.vp);

        tabLayout.setupWithViewPager(vp);
        List<Fragment> fragments = new ArrayList<>();
        List<String> titles = new ArrayList<>();

        fragments.add(new FirstFragment());
        fragments.add(new SecondFragment());
        fragments.add(new ThirdFragment());

        titles.add("我的");
        titles.add("音乐馆");
        titles.add("发现");

        MyVpAdapter adapter = new MyVpAdapter(getSupportFragmentManager(),fragments,titles);
        vp.setAdapter(adapter);

    }


}
