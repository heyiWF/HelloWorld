package com.iwf.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mBtnButton4;
    private TextView mTv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mBtnButton4 = findViewById(R.id.btn_4);
        mBtnButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"Button 4",Toast.LENGTH_SHORT).show();
            }
        });
        mTv1 = findViewById(R.id.tv_1);
        mTv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"Text 1",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showToast(View view)
    {
        Toast.makeText(this,"Button 3",Toast.LENGTH_SHORT).show();
    }
}
