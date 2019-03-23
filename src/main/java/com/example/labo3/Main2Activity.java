package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.labo3.utils.AppConstant;

import static android.content.Intent.EXTRA_TEXT;
import static com.example.labo3.utils.AppConstant.EMAIL_KEY;
import static com.example.labo3.utils.AppConstant.GENDER_KEY;
import static com.example.labo3.utils.AppConstant.PASS_KEY;
import static com.example.labo3.utils.AppConstant.USER_KEY;

public class Main2Activity extends AppCompatActivity {


    private TextView mTextUser, mTextPass, mTextEmail, mTextGender;
    private Button mButtonShare;
    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mTextUser = findViewById(R.id.tv_user);
        mTextEmail = findViewById(R.id.tv_email);
        mTextPass = findViewById(R.id.tv_pass);
        mTextGender = findViewById(R.id.tv_gender);

        mButtonShare = findViewById(R.id.btn_share);


        Intent mIntent = getIntent();
        Bundle extras = mIntent.getExtras();
        data = extras.getString(USER_KEY) + "," + extras.getString(PASS_KEY) + "," + extras.getString(EMAIL_KEY) + "," + extras.getString(GENDER_KEY);
        if (mIntent != null) {
            mTextUser.setText(mTextUser.getText() + extras.getString(USER_KEY));
            mTextPass.setText(mTextPass.getText() + extras.getString(PASS_KEY));
            mTextEmail.setText(mTextEmail.getText() + extras.getString(EMAIL_KEY));
            mTextGender.setText(mTextGender.getText() + extras.getString(GENDER_KEY));

        }
        mButtonShare.setOnClickListener(v -> {

            Intent mIntent2 = new Intent();
            mIntent2.putExtra(Intent.EXTRA_TEXT, data);
            mIntent2.setType("text/plain");
            mIntent2.setAction(Intent.ACTION_SEND);

            startActivity(mIntent2);
        });


    }
}
