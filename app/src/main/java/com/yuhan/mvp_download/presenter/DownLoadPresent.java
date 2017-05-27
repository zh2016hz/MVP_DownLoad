package com.yuhan.mvp_download.presenter;

import android.view.View;

import com.yuhan.mvp_download.View.IDownloadView;
import com.yuhan.mvp_download.modle.IloadMode;
import com.yuhan.mvp_download.modle.Onresult;
import com.yuhan.mvp_download.modle.loadMode;

/**
 * Created by aa on 2017/5/27.
 *
 * 具体的实现类。重写负的接口这里就能拿到mode传过来进度信息，然后我要反馈给View去显示，把成员变量的值 =   mode = new loadMode(this);
 */

public class DownLoadPresent  implements IPresenter{
    private IloadMode  mode;
    private IDownloadView view;
    public DownLoadPresent(IDownloadView view){
        this.view = view;
        mode = new loadMode(this);

    }
    public void goooooo(){
        mode.update("http://192.22.222.22:xxxxx");
    }



    @Override
    public void downloadProgress(int progress) {

        view.progress(progress);

    }
}
