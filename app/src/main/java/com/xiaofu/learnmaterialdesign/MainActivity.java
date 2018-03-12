package com.xiaofu.learnmaterialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_toolbar).setOnClickListener(this);
        findViewById(R.id.btn_bottom_sheet_dialog).setOnClickListener(this);
        findViewById(R.id.btn_app_bar_layout).setOnClickListener(this);
        findViewById(R.id.btn_collapsing_toolbar_layout).setOnClickListener(this);
        findViewById(R.id.btn_fab_snack_bar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_toolbar:
                startActivity(new Intent(this, ToolbarActivity.class));
                break;
            case R.id.btn_bottom_sheet_dialog:
                startActivity(new Intent(this, BottomSheetDialogActivity.class));
                break;
            case R.id.btn_app_bar_layout:
                startActivity(new Intent(this, AppbarLayoutActivity.class));
                break;
            case R.id.btn_collapsing_toolbar_layout:
                startActivity(new Intent(this, CollapsingToolbarActivity.class));
                break;
            case R.id.btn_fab_snack_bar:
                startActivity(new Intent(this, FabSnackBarActivity.class));
                break;
        }
    }
}
