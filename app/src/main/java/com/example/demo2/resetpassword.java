package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class resetpassword extends AppCompatActivity {


    EditText resetaccount, resetphone, resetemail;
    Button buttonresetp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resetpassword);


        resetaccount=findViewById(R.id.resetaccount);
        resetphone=findViewById(R.id.resetphone);
        resetemail=findViewById(R.id.resetemail);

        buttonresetp=findViewById(R.id.buttonresetp);
        View buttonresetback = findViewById(R.id.resetback);

        buttonresetback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentActivityIntent();
                startActivity(getIntent());
            }
        });

        buttonresetp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(resetaccount.getText().toString()) ||TextUtils.isEmpty(resetphone.getText().toString())
                        || TextUtils.isEmpty(resetemail.getText().toString()))
                {

                    Toast.makeText(resetpassword.this, "Empty Fields", Toast.LENGTH_LONG).show();
                }
                else {

                    Toast.makeText(resetpassword.this, " Check Email for new password", Toast.LENGTH_LONG).show();


                }


            }

        });




    }
}