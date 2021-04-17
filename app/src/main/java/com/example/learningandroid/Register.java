package com.example.learningandroid;

import androidx.fragment.app.Fragment;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class Register extends Fragment {
    EditText etDate;
    Button btnRegisterFrm;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.activity_register, container, false);
        etDate = view.findViewById(R.id.etRegisterDate);
        etDate.setInputType(InputType.TYPE_NULL);
        etDate.requestFocus();
        etDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dateDialog(v);
            }
        });
        btnRegisterFrm = view.findViewById(R.id.btnRegisterFrm);
        btnRegisterFrm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etDate.setText("hello");
            }
        });
        return view;
    }
    private void dateDialog(View view){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis()-1000);
        DatePickerDialog datePickerDialog = new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                etDate.setText(simpleDateFormat.format(calendar.getTime()));
            }
        },calendar.get(Calendar.YEAR),calendar.get(Calendar.MONDAY),calendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }
}