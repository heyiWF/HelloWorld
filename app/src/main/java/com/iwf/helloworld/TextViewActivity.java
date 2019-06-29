package com.iwf.helloworld;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mTv4, mTv5, mTv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv4 = findViewById(R.id.tv_4);
        mTv5 = findViewById(R.id.tv_5);
        mTv6 = findViewById(R.id.tv_6);
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mTv4.getPaint().setAntiAlias(true);  //Antialias
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        mTv5.getPaint().setAntiAlias(true);  //Antialias
        mTv6.setText(Html.fromHtml("<u>Hello World!</u>"));
    }
}
