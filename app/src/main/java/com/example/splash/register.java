package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);




    }
    public void displayToastReg(View view){
        Toast.makeText(register.this,"Registeration is successful",Toast.LENGTH_SHORT).show();
    }
    public void displayToastsImage(View view){
        Toast.makeText(register.this,"upload a image",Toast.LENGTH_SHORT).show();
    }
}
