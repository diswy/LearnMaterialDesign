package com.xiaofu.learnmaterialdesign.data;

import com.xiaofu.learnmaterialdesign.bean.MusicInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:          小夫
 * Date:            2018/3/2 15:42
 * Description:     描述该类功能
 * <p>
 * 大人者，言不必信，行不必果，惟义所在
 */

public class MockData {
    public static List<MusicInfo> getMusicList(){
        List<MusicInfo> mlist = new ArrayList<>();
        mlist.add(new MusicInfo("Lost Without You","Josh Vietti"));
        mlist.add(new MusicInfo("末班车(Live)","林俊杰"));
        mlist.add(new MusicInfo("烟火里的尘埃","华晨宇"));
        mlist.add(new MusicInfo("IF YOU","BIGBANG"));
        mlist.add(new MusicInfo("Rise(上升)(Epic Music)","John Dreamer"));
        mlist.add(new MusicInfo("In The End","Linkin Park"));
        mlist.add(new MusicInfo("Numb","Linkin Park"));
        mlist.add(new MusicInfo("凉凉","杨宗纬/张碧晨"));
        mlist.add(new MusicInfo("Luv Letter(情书)","DJ OKAWARI"));
        mlist.add(new MusicInfo("Weight of the World/the End of YoRHa","MONACA"));
        mlist.add(new MusicInfo("飘向北方","黄明志/王力宏"));
        mlist.add(new MusicInfo("不为谁而作的歌","林俊杰"));
        mlist.add(new MusicInfo("佛系少女","冯提莫"));
        return mlist;
    }
}
