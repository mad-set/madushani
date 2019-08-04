package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    private Button btnnext;
    private Button btnProfile;
    private Button btnBuss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnnext = (Button)findViewById(R.id.button);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opennext();
            }
        });
        btnBuss = (Button)findViewById(R.id.buss);
        btnBuss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBuss();
            }
        });
        btnProfile = (Button)findViewById(R.id.pro);
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPro();
            }
        });

    }

    private void opennext() {

        Intent intent = new Intent(this,selectLogin.class);
        startActivity(intent);
    }
    private void openBuss() {

        Intent intent = new Intent(this,business_info.class);
        startActivity(intent);
    }
    private void openPro() {

        Intent intent = new Intent(this,profile.class);
        startActivity(intent);
    }
}
