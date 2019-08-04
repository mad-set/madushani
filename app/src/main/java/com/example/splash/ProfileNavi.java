package com.example.splash;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileNavi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_navi);
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navi);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new homefrag()).commit();

    }

   private BottomNavigationView.OnNavigationItemSelectedListener navListener =
           new BottomNavigationView.OnNavigationItemSelectedListener() {
               @Override
               public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                   Fragment selectedFragment =  null;

                   switch (menuItem.getItemId())
                   {
                       case R.id.pro:
                           selectedFragment = new homefrag();


                       case R.id.businessInfo:
                           selectedFragment = new businessInfo ();
                   }

                   getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                           selectedFragment).commit();
                   return true;
               }
           };
}
