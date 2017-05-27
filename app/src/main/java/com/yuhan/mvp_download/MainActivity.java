package com.yuhan.mvp_download;

import android.app.ProgressDialog;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private ConstraintLayout cl;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.text);
        cl = (ConstraintLayout) findViewById(R.id.gg);
        init();

    }

    private void init() {
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("下载");
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressDialog.show();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        datadownload();
                    }
                }).start();

            }
        });
    }

    private void datadownload() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            final int finalI = i;
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    progressDialog.setProgress(finalI);
                    if (finalI == 99) {
                        progressDialog.dismiss();
                    }
                }
            });

        }
    }
}
