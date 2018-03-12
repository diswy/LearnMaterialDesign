package com.xiaofu.learnmaterialdesign;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FabSnackBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab_snack_bar);

        FloatingActionButton fab1 = findViewById(R.id.fab_1);
        FloatingActionButton fab2 = findViewById(R.id.fab_2);

        fab1.setOnClickListener(v -> {
            Snackbar snackbar = Snackbar.make(v, "自定义Snackbar背景 + 自定义消息字体颜色", Snackbar.LENGTH_LONG);
            // 系统的Snackbar没有提供修改背景颜色
            View view = snackbar.getView();
            // 修改背景颜色
            view.setBackgroundColor(getResources().getColor(R.color.snack_bar_bg));
            // 修改消息字体颜色 PS：这个layout是design库里面的
            TextView mSnackText = view.findViewById(R.id.snackbar_text);
            mSnackText.setTextColor(getResources().getColor(R.color.tv33));
            snackbar.show();
            // 实际使用，可以封装一下，以免麻烦~
        });

        fab2.setOnClickListener(v -> {
            // LENGTH_INDEFINITE不会自动消失，需要手动处理
            Snackbar snackbar = Snackbar.make(v, "点击Fab2", Snackbar.LENGTH_INDEFINITE);
            snackbar.setAction("Dismiss", v2 -> Toast.makeText(this, "点击了Action", Toast.LENGTH_SHORT).show());
            snackbar.show();
        });

    }
}
