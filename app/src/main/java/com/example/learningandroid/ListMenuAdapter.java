package com.example.learningandroid;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.learningandroid.R;
import com.example.learningandroid.model.ButtonMainModel;

import java.util.ArrayList;

public class ListMenuAdapter extends RecyclerView.Adapter<ListMenuAdapter.ViewHolder> {

    private ArrayList<ButtonMainModel> rvData;

    public ListMenuAdapter(ArrayList<ButtonMainModel> inputData) {
        rvData = inputData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public Button btn;
        public ViewHolder(View v) {
            super(v);
            btn =  v.findViewById(R.id.btn);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_main_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String name = rvData.get(position).getText();
        holder.btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        Toast.makeText(v.getContext(), "sayur", Toast.LENGTH_SHORT).show();
                        try {
                            Intent intent = new Intent(v.getContext(), Class.forName("com.example.learningandroid."+rvData.get(position).getLink()));
                            v.getContext().startActivity(intent);
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }

                    }
                }
        );
        holder.btn.setText(name);
    }

    @Override
    public int getItemCount() {
        return rvData.size();
    }
}
