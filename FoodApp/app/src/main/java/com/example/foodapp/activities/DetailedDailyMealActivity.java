package com.example.foodapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.foodapp.R;
import com.example.foodapp.adapters.DetailedDailyAdapter;
import com.example.foodapp.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<DetailedDailyModel> detailDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;


    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if (type != null && type.equalsIgnoreCase("breakfast")) {
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.fav1, "Breakfast", "description", "4.4", "40", "10am to 9pm"));
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.fav2, "Breakfast", "description", "4.4", "40", "10am to 9pm"));
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.fav3, "Breakfast", "description", "4.4", "40", "10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();

        }

        if (type != null && type.equalsIgnoreCase("sweets")) {
            imageView.setImageResource(R.drawable.sweets);
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.s1, "Sweet", "description", "4.4", "40", "10am to 9pm"));
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.s2, "Sweet", "description", "4.4", "40", "10am to 9pm"));
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.s3, "Sweet", "description", "4.4", "40", "10am to 9pm"));
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.s4, "Sweet", "description", "4.4", "40", "10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();

        }

        if (type != null && type.equalsIgnoreCase("lunch")) {
            imageView.setImageResource(R.drawable.lunch);
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.lunch1, "Lunch", "description", "4.4", "40", "10am to 9pm"));
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.lunch2, "Lunch", "description", "4.4", "40", "10am to 9pm"));
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.lunch3, "Lunch", "description", "4.4", "40", "10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();

        }

        if (type != null && type.equalsIgnoreCase("dinner")) {
            imageView.setImageResource(R.drawable.dinner);
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.dinner1, "Dinner", "description", "4.4", "40", "10am to 9pm"));
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.dinner2, "Dinner", "description", "4.4", "40", "10am to 9pm"));
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.dinner3, "Dinner", "description", "4.4", "40", "10am to 9pm"));
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.dinner4, "Dinner", "description", "4.4", "40", "10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();

        }
        if (type != null && type.equalsIgnoreCase("coffee")) {
            imageView.setImageResource(R.drawable.coffe);
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.coffe1, "Coffee", "description", "4.4", "40", "10am to 9pm"));
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.coffe2, "Coffee", "description", "4.4", "40", "10am to 9pm"));
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.coffe3, "Coffee", "description", "4.4", "40", "10am to 9pm"));
            detailDailyModelList.add(new DetailedDailyModel(R.drawable.coffe4, "Coffee", "description", "4.4", "40", "10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();

        }





    }
}