package com.xiaofu.learnmaterialdesign;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

public class ToolbarActivity extends AppCompatActivity {
    private Toolbar toolbar1, toolbar2, toolbar3, toolbar4;
    private boolean isLike;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        toolbar1 = findViewById(R.id.toolbar_1);
        toolbar2 = findViewById(R.id.toolbar_2);
        toolbar3 = findViewById(R.id.toolbar_3);
        toolbar4 = findViewById(R.id.toolbar_4);

        // Toolbar导航按钮图标的设置及监听
        // 除了可以代码设置，同样可以在XML中配置，例子中3、4均采用XML配置
        toolbar1.setNavigationIcon(R.mipmap.navigation_back_white);
        toolbar2.setNavigationIcon(R.mipmap.icon_menu_1);

        toolbar1.setNavigationOnClickListener(v -> finish());
        toolbar2.setNavigationOnClickListener(v -> finish());
        toolbar3.setNavigationOnClickListener(v -> finish());
        toolbar4.setNavigationOnClickListener(v -> finish());


        // 第一个配置了Toolbar可包含的所有设置，如不需要可不配置
        toolbar1.setLogo(R.mipmap.logo_airplane);
        toolbar1.setTitle("Hello Toolbar");
        toolbar1.setSubtitle("this is subtitle");
        toolbar1.setTitleMarginStart(90);
        toolbar1.inflateMenu(R.menu.toolbar_menu_1);
        // 该方法可以替换默认的溢出菜单图标
//        toolbar1.setOverflowIcon();
        toolbar1.setOnMenuItemClickListener(item -> {
            switch (item.getItemId()) {
                case R.id.toolbar_menu_like:
                    System.out.println("--->喜欢");
                    isLike = !isLike;
                    item.setIcon(isLike ? R.mipmap.icon_like_selected: R.mipmap.icon_like_normal);
                    break;
                case R.id.toolbar_menu_setting:
                    System.out.println("--->设置");
                    break;
                case R.id.toolbar_menu_about_us:
                    System.out.println("--->关于我们");
                    break;
            }
            return false;
        });

        toolbar2.setTitle("仅有一个标题");

        toolbar3.inflateMenu(R.menu.toobar_menu_text);

        mEditText = toolbar4.findViewById(R.id.toolbar_edit);
        toolbar4.inflateMenu(R.menu.toobar_menu_search);
        toolbar4.setOnMenuItemClickListener(item -> {
            if (item.getItemId() == R.id.toolbar_menu_search){
                // 除了Toast的两种时间模式，添加了第三种时间模式，可一直保持在屏幕
                // 如果不配置Action不会有右边的可选操作
                Snackbar snackbar = Snackbar.make(toolbar4,mEditText.getText().toString(),Snackbar.LENGTH_INDEFINITE);
                snackbar.setAction("UNDO",v -> snackbar.dismiss());
                snackbar.show();
            }
            return false;
        });

    }


}
