package com.dcastalia.expandablelistandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    static void startActivity(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(MainActivity.class.getSimpleName());

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,0));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        final List<ItemModel> data = new ArrayList<>();
        data.add(new ItemModel("0 ACCELERATE_DECELERATE_INTERPOLATOR"," A Description For this title goes here "));
        data.add(new ItemModel("1 ACCELERATE_INTERPOLATOR"," A Description For this title goes here "));
        data.add(new ItemModel("2 BOUNCE_INTERPOLATOR"," A Description For this title goes here "));
        data.add(new ItemModel("3 DECELERATE_INTERPOLATOR"," A Description For this title goes here "));
        data.add(new ItemModel("4 FAST_OUT_LINEAR_IN_INTERPOLATOR"," A Description For this title goes here "));
        data.add(new ItemModel("5 FAST_OUT_SLOW_IN_INTERPOLATOR"," A Description For this title goes here "));
        data.add(new ItemModel("6 LINEAR_INTERPOLATOR"," A Description For this title goes here "));
        data.add(new ItemModel("7 LINEAR_OUT_SLOW_IN_INTERPOLATOR"," A Description For this title goes here "));
        recyclerView.setAdapter(new RecylerViewAdapter(data));
    }
}