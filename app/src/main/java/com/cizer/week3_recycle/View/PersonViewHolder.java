package com.cizer.week3_recycle.View;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cizer.week3_recycle.R;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    public TextView txtViewName;

    public TextView txtViewAge;

    public ImageView imgView;

    public PersonViewHolder(@NonNull View itemView){
        super(itemView);
        txtViewName = itemView.findViewById(R.id.textViewName); //actual ID for name TextView
        txtViewAge = itemView.findViewById(R.id.textViewAge);//actual ID for age TextView
        imgView = itemView.findViewById(R.id.ImageView);
    }
}

