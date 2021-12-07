package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity  extends AppCompatActivity {
    RecyclerView recyclerView ;
    private RecyclerView.Adapter customAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        ArrayList villeNames= new ArrayList() ;
        villeNames.add("bizerte");
        villeNames.add("tunis");
        ArrayList villeImages = new ArrayList();
        villeImages.add(R.drawable.bizerte);
        villeImages.add(R.drawable.kasserine);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
         customAdapter = new CustomAdapter(MainActivity.this,villeNames,villeImages);
        recyclerView.setAdapter(customAdapter);





    }
}