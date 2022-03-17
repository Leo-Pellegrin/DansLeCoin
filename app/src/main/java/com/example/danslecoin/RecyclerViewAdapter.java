package com.example.danslecoin;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter {

    List<String> dataList;

    RecyclerViewAdapter(){
        dataList = new ArrayList<String>();
        dataList.add("Le super portail");
        dataList.add("Un autre portail");
        dataList.add("Encore un autre portail");
        dataList.add("Le resto-u");
        dataList.add("Le dep tc");
        dataList.add("Le dep gea");
        dataList.add("Le dep info");
        dataList.add("Le dep gmp");
        dataList.add("La cafet");
        dataList.add("La biblio");
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

}
