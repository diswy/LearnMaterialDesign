package com.xiaofu.learnmaterialdesign;

import android.graphics.Color;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CollapsingToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar);

        // PS：这些代码也可以不要，一样有同样的效果，这里主要是解决文字显示问题
        // xml中contentScrim属性，如果不设置，折叠后依旧是我们的图片，需要什么效果看官自己取舍
        AppBarLayout appBarLayout = findViewById(R.id.app_bar_layout);
        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapse_layout);
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
        collapsingToolbarLayout.setExpandedTitleColor(Color.TRANSPARENT);
        appBarLayout.addOnOffsetChangedListener((appBarLayout1, verticalOffset) -> {
            if(Math.abs(verticalOffset) >= appBarLayout.getTotalScrollRange()){
                collapsingToolbarLayout.setTitle("CollapsingToolbarLayout");
            }else{
                collapsingToolbarLayout.setTitle("");
            }
        });


    }
}
