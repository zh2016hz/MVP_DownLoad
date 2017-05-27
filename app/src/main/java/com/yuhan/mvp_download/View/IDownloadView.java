package com.yuhan.mvp_download.View;

/**
 * Created by aa on 2017/5/27.
 */

public interface IDownloadView {
    /*
    * 1.要展示一个load
    * 显示
    * 隐藏
    *
    *
    * */
    public void  show();
    public void  hide();
    public void  progress(int progress);

}
