package com.example.learningandroid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_login, container, false);
        TextView tvEmail,tvPassword;
        Button btnLogin;
        btnLogin=view.findViewById(R.id.btnLoginFrm);
        tvEmail=view.findViewById(R.id.etLoginEmail);
        tvPassword=view.findViewById(R.id.etLoginPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),("Email :"+tvEmail.getText() +" Ps :"+tvPassword.getText()),Toast.LENGTH_SHORT).show();
//                Toast.makeText(v.getContext(),("login"+"hello"),Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}