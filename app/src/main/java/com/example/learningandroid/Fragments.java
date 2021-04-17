package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentTransaction;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fragments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);
        Button btnLogin,btnRegister;
        btnLogin= findViewById(R.id.btnLogin);
        btnRegister= findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f= new Login();
                loadFragment(f);
//                fts.replace(R.id.frm, new Login(), "Login").commit();
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f= new Register();
                loadFragment(f);
//                 fts.replace(R.id.frm, new Register(), "Register").commit();
            }
        });
    }
    private void loadFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frm, fragment)
                .commit();
    }
}
