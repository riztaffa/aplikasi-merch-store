package com.example.merchstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMerch;
    private ArrayList<Merch> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMerch = findViewById(R.id.rv_merch);
        rvMerch.setHasFixedSize(true);

        list.addAll(MerchData.getListData());
        showRecyclerCardView();

    }


    private void showRecyclerCardView(){
        rvMerch.setLayoutManager(new LinearLayoutManager(this));
        CardViewAdapter cardViewAdapter= new CardViewAdapter(list);
        rvMerch.setAdapter(cardViewAdapter);
    }

}