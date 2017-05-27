package com.yuhan.mvp_download.View;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.yuhan.mvp_download.MainActivity;
import com.yuhan.mvp_download.R;
import com.yuhan.mvp_download.presenter.DownLoadPresent;

public class DownLoadActivity extends AppCompatActivity  implements IDownloadView{

    private TextView tv;
    private  DownLoadPresent downLoadPresent ;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_down_load);
        tv = (TextView) findViewById(R.id.text1);

        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("下载");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 downLoadPresent = new DownLoadPresent(DownLoadActivity.this);
                downLoadPresent.goooooo();
            }
        });
    }

    @Override
    public void show() {
        progressDialog.show();
    }

    @Override
    public void hide() {
        progressDialog.dismiss();
    }

    @Override
    public void progress(int progress) {


        progressDialog.setProgress(progress);
    }
}
