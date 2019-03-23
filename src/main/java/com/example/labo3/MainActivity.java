package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.labo3.utils.AppConstant;

import static com.example.labo3.utils.AppConstant.EMAIL_KEY;
import static com.example.labo3.utils.AppConstant.GENDER_KEY;
import static com.example.labo3.utils.AppConstant.PASS_KEY;
import static com.example.labo3.utils.AppConstant.USER_KEY;

public class MainActivity extends AppCompatActivity {
    private EditText mEditUs,mEditPass,mEditEmail,mEditGen;
    private Button mButtonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditUs = findViewById(R.id.et_user);
        mEditPass = findViewById(R.id.et_pass);
        mEditEmail = findViewById(R.id.et_email);
        mEditGen = findViewById(R.id.et_gender);

        mButtonSubmit = findViewById(R.id.btn_submit);



        mButtonSubmit.setOnClickListener(v ->{
            String user = mEditUs.getText().toString();
            String pass = mEditPass.getText().toString();
            String email = mEditEmail.getText().toString();
            String gender = mEditGen.getText().toString();
            Intent mIntent = new Intent(MainActivity.this,Main2Activity.class);
            Bundle extras = new Bundle();
            extras.putString(USER_KEY, user);
            extras.putString(PASS_KEY,pass);
            extras.putString(EMAIL_KEY,email);
            extras.putString(GENDER_KEY,gender);
            //mIntent.setType("text/plain");
            //mIntent.setAction(Intent.ACTION_SEND);
            mIntent.putExtras(extras);
            startActivity(mIntent);
        });
    }
}
