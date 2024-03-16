package com.cizer.week3_recycle.View;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cizer.week3_recycle.Model.Student;
import com.cizer.week3_recycle.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<PersonViewHolder> {

    private ArrayList<Student> data;

    // Constructor to initialize data
    public MyAdapter(ArrayList<Student> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // create a new view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_row_item, parent, false); // Replace text_row_item with your actual item layout XML
        return new PersonViewHolder(itemView);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        Student student = data.get(position);
        int placeH = student.getImage();
        // Replace the contents of the view with the data from the Student object
        holder.txtViewName.setText(student.getName());
        holder.txtViewAge.setText(String.valueOf(student.getAge()));
        holder.imgView.setImageResource(placeH);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return data.size();
    }

}
