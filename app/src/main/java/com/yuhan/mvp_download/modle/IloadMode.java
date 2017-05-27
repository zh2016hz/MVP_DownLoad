package com.yuhan.mvp_download.modle;

/**
 * Created by aa on 2017/5/27.
 * 接口类，，要明白要做什么  就是要下载拿到进度，这里就一个方法
 */

public interface IloadMode {
    public int update(int progress,Onresult  onresult);
}
