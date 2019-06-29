package com.iwf.helloworld.gridview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.iwf.helloworld.R;

public class GridViewActivity extends AppCompatActivity {

    private GridView mGv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        mGv = findViewById(R.id.gv);
        mGv.setAdapter(new MyGridViewAdapter(GridViewActivity.this));
        mGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this,"Press: "+position,Toast.LENGTH_SHORT).show();
            }
        });
        mGv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this,"Long Press: "+position,Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
