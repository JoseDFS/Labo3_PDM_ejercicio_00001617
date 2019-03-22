package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.labo3.utils.AppConstant;

public class Main2Activity extends AppCompatActivity {
     private TextView mTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mTextview= findViewById(R.id.tv_message);
        Intent mIntent = getIntent();
        if (mIntent != null){
            mTextview.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
