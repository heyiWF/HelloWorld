package com.iwf.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView mIv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        mIv4 = findViewById(R.id.iv_4);
        Glide.with(this).load("https://is3-ssl.mzstatic.com/image/thumb/Purple113/v4/37/0f/3b/370f3b08-73ff-ec49-9218-74e987e0dab8/AppIcon-0-1x_U007emarketing-0-85-220-0-6.png/246x0w.jpg").into(mIv4);
    }
}
