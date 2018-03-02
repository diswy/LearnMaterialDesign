package com.xiaofu.learnmaterialdesign;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.xiaofu.learnmaterialdesign.adapter.MusicAdapter;
import com.xiaofu.learnmaterialdesign.data.MockData;

public class BottomSheetDialogActivity extends AppCompatActivity implements View.OnClickListener {

    private BottomSheetDialog mShareDialog;
    private BottomSheetDialog mMusicDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet_dialog);


        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(v -> finish());
        toolbar.inflateMenu(R.menu.menu_share);
        toolbar.setOnMenuItemClickListener(item -> {
            if (item.getItemId() == R.id.menu_share) {
                showShareDialog();
            }
            return false;
        });


        findViewById(R.id.btn_show_bottom_dialog).setOnClickListener(v -> showBottomDialog());

    }

    // 弹出一个多条目的底部控件
    private void showBottomDialog() {
        if (mMusicDialog == null) {
            mMusicDialog = new BottomSheetDialog(this);

            View v = LayoutInflater.from(this).inflate(R.layout.bottom_sheet_music_dialog, null);
            RecyclerView rv = v.findViewById(R.id.rv);
            rv.setLayoutManager(new LinearLayoutManager(this));
            MusicAdapter musicAdapter = new MusicAdapter();
            rv.setAdapter(musicAdapter);
            musicAdapter.setData(MockData.getMusicList());

            mMusicDialog.setContentView(v);
            mMusicDialog.show();
        } else {
            mMusicDialog.show();
        }
    }

    // 显示分享布局
    private void showShareDialog() {
        if (mShareDialog == null) {
            mShareDialog = new BottomSheetDialog(this);
            View v = LayoutInflater.from(this).inflate(R.layout.bottom_sheet_share_dialog, null);
            v.findViewById(R.id.share_weibo).setOnClickListener(this);
            v.findViewById(R.id.share_wx).setOnClickListener(this);
            v.findViewById(R.id.share_quanzi).setOnClickListener(this);
            v.findViewById(R.id.share_facebook).setOnClickListener(this);
            v.findViewById(R.id.share_twitter).setOnClickListener(this);
            mShareDialog.setContentView(v);
            mShareDialog.show();
        } else {
            mShareDialog.show();
        }
    }

    @Override
    public void onClick(View v) {
        String s = "";
        switch (v.getId()) {
            case R.id.share_weibo:
                s = "点击了 微博";
                break;
            case R.id.share_wx:
                s = "点击了 微信";
                break;
            case R.id.share_quanzi:
                s = "点击了 朋友圈";
                break;
            case R.id.share_facebook:
                s = "点击了 Facebook";
                break;
            case R.id.share_twitter:
                s = "点击了 Twitter";
                break;
        }
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
