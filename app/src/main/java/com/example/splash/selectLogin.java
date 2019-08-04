package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selectLogin extends AppCompatActivity {
    private Button cus;
    private  Button sup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_login);

        cus = (Button) findViewById(R.id.btnCus);
        cus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCusLogin();
            }


        });
        sup = (Button) findViewById(R.id.btnsup);
        sup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSupLogin();
            }


        });


    }

    public void openSupLogin() {


        Intent intent = new Intent(this, suplogin.class);
        startActivity(intent);
    }



    public void openCusLogin() {

                Intent intent = new Intent(this, login.class);
                startActivity(intent);
            }





}
