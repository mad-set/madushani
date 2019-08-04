package com.example.splash;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class suplogin extends AppCompatActivity {

  private Button supReg ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suplogin);

        supReg = (Button) findViewById(R.id.btnReg);
        supReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opennext();
            }
        });
    }

    private void opennext() {

        Intent intent = new Intent(this,supregister.class);
        startActivity(intent);
    }

    public void displayToastLogin(View view) {
        Toast.makeText(suplogin.this,"login is successful",Toast.LENGTH_SHORT).show();
    }
}
