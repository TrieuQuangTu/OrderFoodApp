package com.example.foodapp.ui.ui.dailymeal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodapp.R;
import com.example.foodapp.adapters.DailyMealAdapter;
import com.example.foodapp.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;


public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.daily_meal_fragment, container, false);

        recyclerView=root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast,"Breakfast","30% OFF","Description","breakfast"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch,"lunch","20% OFF","Description","lunch"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner,"dinner","39% OFF","Description","dinner"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets,"sweets","50% OFF","Description","sweets"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffe,"coffe","30% OFF","Description","coffe"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();
        return root;
    }
}