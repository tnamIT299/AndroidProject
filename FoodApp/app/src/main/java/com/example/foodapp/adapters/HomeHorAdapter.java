package com.example.foodapp.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.models.HomeHorModel;
import com.example.foodapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;


    boolean check = true;
    boolean select = true ;
    int row_index  = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item, parent, false));
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if(check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza1", "10:00 - 23:00", "4.9", "Min -35$"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza2", "10:00 - 23:00", "4.9", "Min -35$"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza3", "10:00 - 23:00", "4.9", "Min -35$"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pizza4", "10:00 - 23:00", "4.9", "Min -35$"));

            updateVerticalRec.callback(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    row_index = position;
                    notifyDataSetChanged();

                    if(position == 0){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza1", "10:00 - 23:00", "4.9", "Min -35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza2", "10:00 - 23:00", "4.9", "Min -35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza3", "10:00 - 23:00", "4.9", "Min -35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pizza4", "10:00 - 23:00", "4.9", "Min -35$"));

                        updateVerticalRec.callback(position,homeVerModels);
                    }

                    else if ( position == 1){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.burger1, "Burger1", "10:00 - 23:00", "4.9", "Min -35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger2, "Burger2", "10:00 - 23:00", "4.9", "Min -35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger4, "Burger3", "10:00 - 23:00", "4.9", "Min -35$"));

                        updateVerticalRec.callback(position,homeVerModels);
                    }
                    else if ( position == 2){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.fries1, "Fries1", "10:00 - 23:00", "4.9", "Min -35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2, "Fries2", "10:00 - 23:00", "4.9", "Min -35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries3, "Fries3", "10:00 - 23:00", "4.9", "Min -35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries4, "Fries4", "10:00 - 23:00", "4.9", "Min -35$"));

                        updateVerticalRec.callback(position,homeVerModels);
                    }
                    else if ( position == 3){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.icecream1, "Ice cream1", "10:00 - 23:00", "4.9", "Min -35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream2, "Ice cream2", "10:00 - 23:00", "4.9", "Min -35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream3, "Ice cream3", "10:00 - 23:00", "4.9", "Min -35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream4, "Ice cream4", "10:00 - 23:00", "4.9", "Min -35$"));

                        updateVerticalRec.callback(position,homeVerModels);
                    }
                    else if ( position == 4){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich1, "Sandwich1", "10:00 - 23:00", "4.9", "Min -35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich2, "Sandwich2", "10:00 - 23:00", "4.9", "Min -35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich3, "Sandwich3", "10:00 - 23:00", "4.9", "Min -35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich4, "Sandwich4", "10:00 - 23:00", "4.9", "Min -35$"));

                        updateVerticalRec.callback(position,homeVerModels);
                    }

                }
            });

            if(select){
                if(position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select =  false;
                }
            }
            else{
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else{
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
           ImageView imageView;
           TextView name;
           CardView cardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
