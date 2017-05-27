package com.yuhan.mvp_download.modle;

import com.yuhan.mvp_download.presenter.IPresenter;

/**
 * Created by aa on 2017/5/27.
 * 这个是mode接口的实现类
 * 一般通过构造方法引入 桥梁 在调用桥梁的拿回去给View 更新的信息这里就是进度条
 */

public class loadMode implements IloadMode {
/*
*
*
* */
    private  IPresenter iPresenter;
    public loadMode(IPresenter  iPresenter){
        this.iPresenter =iPresenter;

    }
    @Override
    public int update(int progress, Onresult onresult) {
        //在这里面处理下载处理的数据 ，然后调用桥梁的显示进度条方法      ,那么桥梁就能收到数据了
        for (int i = 0; i < 1000; i++) {
            iPresenter.downloadProgress(i);
        }



        return 0;
    }


}
