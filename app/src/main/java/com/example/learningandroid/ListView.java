package com.example.learningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.learningandroid.model.ListViewModel;

import java.util.ArrayList;

public class ListView extends Activity {
    private android.widget.ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView=  findViewById(R.id.lvList);
        ArrayList<ListViewModel> strings= new ArrayList<ListViewModel>();
        strings.add(new ListViewModel("test","Test"));
        strings.add(new ListViewModel("Hello","Hello"));
        strings.add(new ListViewModel("Sayur","Sayur"));
        ListViewAdapter listViewAdapter=new ListViewAdapter(getApplicationContext(),strings);
        listView.setAdapter(listViewAdapter);
    }
}