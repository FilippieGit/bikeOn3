package br.com.etec.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class BikesNovasFragment extends Fragment {

    private List<BikeNova> lstBikeNova;
    RecyclerView idRecBikesNovas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_bikes_novas, container, false);

        idRecBikesNovas = view.findViewById(R.id.idRecBikesNovas);

        //carregar objetos da lista
        lstBikeNova = new ArrayList<>();
        lstBikeNova.add(
                new BikeNova("Vintage",R.drawable.bike_um);
        );




        return view;
    }
}