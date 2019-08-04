package com.example.splash;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Toast;

public class supregister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supregister);

    }
    public void displayToastSupRegImg(View view) {
        Toast.makeText(supregister.this,"upload a image",Toast.LENGTH_SHORT).show();
    }

    public void displayToastSupReg(View view) {
        Toast.makeText(supregister.this,"Registration is successfull",Toast.LENGTH_SHORT).show();

    }
}
