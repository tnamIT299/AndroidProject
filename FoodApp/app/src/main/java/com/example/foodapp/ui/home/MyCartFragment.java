package com.example.foodapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.foodapp.R;

public class MyCartFragment extends Fragment {
    public MyCartFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container, Bundle saveInstanceState){
        return inflater.inflate(R.layout.fragment_my_cart , container , false);
    }
}
