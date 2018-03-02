package com.xiaofu.learnmaterialdesign.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.xiaofu.learnmaterialdesign.R;
import com.xiaofu.learnmaterialdesign.bean.MusicInfo;

import java.util.List;

/**
 * Author:          小夫
 * Date:            2018/3/2 15:19
 * Description:     描述该类功能
 * <p>
 * 大人者，言不必信，行不必果，惟义所在
 */

public class MusicAdapter extends RecyclerView.Adapter {
    private List<MusicInfo> mData;

    public void setData(List<MusicInfo> mData) {
        this.mData = mData;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MusicViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.bottom_sheet_music_dialog_item, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MusicViewHolder musicViewHolder = (MusicViewHolder) holder;

        MusicInfo musicInfo = mData.get(position);

        musicViewHolder.tvName.setText(musicInfo.musicName);

        musicViewHolder.tvArtist.setText(" - " + musicInfo.artist);
    }

    @Override
    public int getItemCount() {
        return mData != null ? mData.size() : 0;
    }

    public static class MusicViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvArtist;
        ImageView btnLike;
        ImageView btnDel;

        MusicViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_music_name);
            tvArtist = itemView.findViewById(R.id.tv_music_artist);
            btnLike = itemView.findViewById(R.id.btn_like);
            btnDel = itemView.findViewById(R.id.btn_del_item);
        }
    }
}
