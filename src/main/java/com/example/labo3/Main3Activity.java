package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static android.content.Intent.EXTRA_TEXT;
import static com.example.labo3.utils.AppConstant.EMAIL_KEY;
import static com.example.labo3.utils.AppConstant.GENDER_KEY;
import static com.example.labo3.utils.AppConstant.PASS_KEY;
import static com.example.labo3.utils.AppConstant.USER_KEY;

public class Main3Activity extends AppCompatActivity {
    private TextView mTextUser, mTextPass, mTextEmail, mTextGender;
    private String[] data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mTextUser = findViewById(R.id.tv_user);
        mTextEmail = findViewById(R.id.tv_email);
        mTextPass = findViewById(R.id.tv_pass);
        mTextGender = findViewById(R.id.tv_gender);

        Intent mIntent = getIntent();

        data = mIntent.getStringExtra(Intent.EXTRA_TEXT).split(",");
        Log.d(data[0],"data");
        if (mIntent != null) {
            mTextUser.setText(mTextUser.getText() + data[0]);
            mTextPass.setText(mTextPass.getText() + data[1]);
            mTextEmail.setText(mTextEmail.getText() + data[2]);
            mTextGender.setText(mTextGender.getText() + data[3]);

        }

    }
}
