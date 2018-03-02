package com.xiaofu.learnmaterialdesign.bean;

/**
 * Author:          小夫
 * Date:            2018/3/2 15:20
 * Description:     描述该类功能
 * <p>
 * 大人者，言不必信，行不必果，惟义所在
 */

public class MusicInfo {
    public String musicName;
    public String artist;
    public boolean isLike;

    public MusicInfo(String musicName, String artist) {
        this.musicName = musicName;
        this.artist = artist;
    }
}
