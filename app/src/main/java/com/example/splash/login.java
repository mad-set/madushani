package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private Button buttonReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonReg = (Button)findViewById(R.id.btnReg);
        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opennext();
            }
        });
    }

    private void opennext() {

        Intent intent = new Intent(this,register.class);
        startActivity(intent);
    }


    public void displayToastLogin(View view) {
        Toast.makeText(login.this,"login successfull",Toast.LENGTH_SHORT).show();
    }



}
