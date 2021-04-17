package com.example.learningandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learningandroid.model.ButtonMainModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<ButtonMainModel> dataSet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataSet = new ArrayList<>();
        initDataset();
        Button btn= findViewById(R.id.btn);
        rvView = findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new ListMenuAdapter(dataSet);
        rvView.setAdapter(adapter);

        FloatingActionButton flButton= findViewById(R.id.flBtn);
        flButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"hello",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initDataset(){
        dataSet.add(new ButtonMainModel("Spannable","SpannableActivity"));
        dataSet.add(new ButtonMainModel("PinchZoom","PinchZoom"));
        dataSet.add(new ButtonMainModel("Fragments", "Fragments"));
//        dataSet.add("Renate");
//        dataSet.add("Elke");
//        dataSet.add("Ursula");
//        dataSet.add("Erika");
//        dataSet.add("Christa");
//        dataSet.add("Gisela");
//        dataSet.add("Monika");

    }
}

