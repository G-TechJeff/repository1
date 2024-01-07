package com.example.demo2;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText account, password;
    Button okbutton, guestbutton, passforgbutton;

    String corectaccount="Admin";
    String corectpassword="admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        account= findViewById(R.id.account);
        password= findViewById(R.id.password);
        okbutton= findViewById(R.id.button);
        guestbutton= findViewById(R.id.guest);
        passforgbutton= findViewById(R.id.passforg);


        passforgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, resetpassword.class);
                startActivity(intent);
            }
        });


        guestbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, guestpage.class);
                startActivity(intent);
            }
        });

        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(account.getText().toString()) || TextUtils.isEmpty(password.getText().toString()))
                {

                Toast.makeText(MainActivity.this, "Empty fields", Toast.LENGTH_LONG).show();
            }
            else if(account.getText().toString().equals(corectaccount)) {
                //check password
                    Toast.makeText(MainActivity.this, "Success login", Toast.LENGTH_LONG).show();
            }

            else {

                            Toast.makeText(MainActivity.this, " Check password and try again", Toast.LENGTH_LONG).show();


                    }


            }
        });

    }
}

