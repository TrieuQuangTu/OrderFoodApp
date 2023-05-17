package com.example.foodapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.foodapp.R;
import com.example.foodapp.adapters.DetailDailyAdapter;
import com.example.foodapp.models.DetailDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDalyMealActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<DetailDailyModel> detailDailyModelList;
    DetailDailyAdapter detailDailyAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daly_meal);

        String type = getIntent().getStringExtra("type");


        //anh xa
        recyclerView = findViewById(R.id.detailed_rec);
        imageView=findViewById(R.id.detailed_img);

        //Cac buoc do ra RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailDailyModelList = new ArrayList<>();
        detailDailyAdapter = new DetailDailyAdapter(detailDailyModelList);
        recyclerView.setAdapter(detailDailyAdapter);

        if (type !=null && type.equalsIgnoreCase("breakfast")){
            detailDailyModelList.add(new DetailDailyModel(R.drawable.fav1,"Break fast","desciption","4.4","40","10am to 9pm"));
            detailDailyModelList.add(new DetailDailyModel(R.drawable.fav2,"Break fast","desciption","4.4","40","10am to 9pm"));
            detailDailyModelList.add(new DetailDailyModel(R.drawable.fav3,"Break fast","desciption","4.4","40","10am to 9pm"));

            //
            detailDailyAdapter.notifyDataSetChanged();
        }

        if (type !=null && type.equalsIgnoreCase("sweets")){
            imageView.setImageResource(R.drawable.sweets);
            detailDailyModelList.add(new DetailDailyModel(R.drawable.s1,"sweets ","desciption","4.4","40","10am to 9pm"));
            detailDailyModelList.add(new DetailDailyModel(R.drawable.s2,"sweets ","desciption","4.4","40","10am to 9pm"));
            detailDailyModelList.add(new DetailDailyModel(R.drawable.s3,"sweets ","desciption","4.4","40","10am to 9pm"));

            //
            detailDailyAdapter.notifyDataSetChanged();
        }

        if (type !=null && type.equalsIgnoreCase("lunch")){
            imageView.setImageResource(R.drawable.lunch);
            detailDailyModelList.add(new DetailDailyModel(R.drawable.s1,"lunch ","desciption","4.4","40","10am to 9pm"));
            detailDailyModelList.add(new DetailDailyModel(R.drawable.s2,"lunch ","desciption","4.4","40","10am to 9pm"));
            detailDailyModelList.add(new DetailDailyModel(R.drawable.s3,"lunch ","desciption","4.4","40","10am to 9pm"));

            //
            detailDailyAdapter.notifyDataSetChanged();
        }

        if (type !=null && type.equalsIgnoreCase("dinner")){
            imageView.setImageResource(R.drawable.dinner);
            detailDailyModelList.add(new DetailDailyModel(R.drawable.s1,"sweets ","desciption","4.4","40","10am to 9pm"));
            detailDailyModelList.add(new DetailDailyModel(R.drawable.s2,"sweets ","desciption","4.4","40","10am to 9pm"));
            detailDailyModelList.add(new DetailDailyModel(R.drawable.s3,"sweets ","desciption","4.4","40","10am to 9pm"));

            //
            detailDailyAdapter.notifyDataSetChanged();
        }
        if (type !=null && type.equalsIgnoreCase("coffe")){
            imageView.setImageResource(R.drawable.coffe);
            detailDailyModelList.add(new DetailDailyModel(R.drawable.s1,"sweets ","desciption","4.4","40","10am to 9pm"));
            detailDailyModelList.add(new DetailDailyModel(R.drawable.s2,"sweets ","desciption","4.4","40","10am to 9pm"));
            detailDailyModelList.add(new DetailDailyModel(R.drawable.s3,"sweets ","desciption","4.4","40","10am to 9pm"));

            //
            detailDailyAdapter.notifyDataSetChanged();
        }




    }
}