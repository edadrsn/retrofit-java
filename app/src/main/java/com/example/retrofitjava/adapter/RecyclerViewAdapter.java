package com.example.retrofitjava.adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitjava.R;
import com.example.retrofitjava.model.CryptoModel;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    ArrayList<CryptoModel> cryptoArrayList;
    String[] colors={"#C890A7","#E8F9FF","#EFF3EA","#FFE2E2","#C4D9FF","#7ED4AD"};
    public RecyclerViewAdapter(ArrayList<CryptoModel> cryptoArrayList){
        this.cryptoArrayList=cryptoArrayList;
    }


    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.recycler_row,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.bind(cryptoArrayList.get(position),colors,position);
    }

    @Override
    public int getItemCount() {
        return cryptoArrayList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView textName,textPrice;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(CryptoModel cryptoModel,String[] colors,Integer position){
            itemView.setBackgroundColor(Color.parseColor(colors[position % 6]));
            textName=itemView.findViewById(R.id.text_name);
            textPrice=itemView.findViewById(R.id.text_price);
            textName.setText(cryptoModel.currency);
            textPrice.setText(cryptoModel.price);
        }
    }
}
