package com.yuhan.mvp_download.presenter;

import com.yuhan.mvp_download.modle.IloadMode;

/**
 *
 *
 * 桥梁的老大接口。你要想，做这个逻辑需要干嘛，需要mode 下载，并把进度条反馈给我桥梁，我桥梁再把这个数据反馈给View去跟新， 所以我要顶一个进度的方法
 * 并在mode 的 实现类中传入，那么我在mode下载时候，就能通过成员变量调用自己这个桥梁方法
 * Created by aa on 2017/5/27.
 */

public interface IPresenter {


     /**
      * 当前下载进度
      * @param progress
      */
     void downloadProgress(int progress);

}
