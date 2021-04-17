package com.example.learningandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.learningandroid.model.ListViewModel;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    Context context;
    ArrayList<ListViewModel> listViewModels;
    LayoutInflater inflater;
    public  ListViewAdapter(Context context, ArrayList<ListViewModel> listViewModels){
        this.context=context;
        this.listViewModels=listViewModels;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listViewModels.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= inflater.inflate(R.layout.list_view_view,null);
        TextView tvName=convertView.findViewById(R.id.tvListView);
        Button btnName=convertView.findViewById(R.id.btnListView);
        tvName.setText(listViewModels.get(position).getName());
        btnName.setText(listViewModels.get(position).getButton());
        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),listViewModels.get(position).getName(),Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
