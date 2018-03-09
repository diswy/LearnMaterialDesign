package com.xiaofu.learnmaterialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class AppbarLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appbar_layout);

        Toolbar toolbar = findViewById(R.id.toolbar_app_layout);
        toolbar.setNavigationOnClickListener(v -> finish());

        // PS：layout_scrollFlags的几种模式请自行学习，注意添加layout_behavior
    }
}
