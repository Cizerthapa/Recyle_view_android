package com.cizer.week3_recycle.View;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cizer.week3_recycle.Model.Student;
import com.cizer.week3_recycle.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Suppose you have a drawable resource named "ic_launcher"
    int drawableResourceId1 = R.drawable.person1;
    int drawableResourceId2 = R.drawable.person2;

    int drawableResourceId3 = R.drawable.person3;

    public ArrayList getStudent(){
        ArrayList data = new ArrayList<Student>();
        data.add(new Student("Abhishek","19",drawableResourceId1));
        data.add(new Student("Prayatna","18",drawableResourceId2));
        data.add(new Student("Ashma","99",drawableResourceId3));
        return data;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity ma = new MainActivity();
        ArrayList<Student> data = ma.getStudent();
        LinearLayoutManager manager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // For linear list

        // Pass your data to the adapter, replace "data" with your actual data
        MyAdapter adapter = new MyAdapter(data);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
    }

}
