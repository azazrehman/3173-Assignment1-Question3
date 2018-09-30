package com.mitsol.question3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;

public class LauncherActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_MS = 3000;
    private Handler mHandler;
    private Runnable mRunnable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        ImageView im= findViewById(R.id.image_view);
        im.setImageResource(R.drawable.bg);
        mHandler = new Handler();
        mRunnable = new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(LauncherActivity.this,HomeActivity.class);
                startActivity(intent);
                //********************************

            }
        };
        mHandler.postDelayed(mRunnable, SPLASH_TIME_MS);
    }
}
