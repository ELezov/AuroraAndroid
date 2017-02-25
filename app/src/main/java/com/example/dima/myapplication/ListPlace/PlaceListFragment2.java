package com.example.dima.myapplication.ListPlace;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dima.myapplication.R;
import com.example.dima.myapplication.Utils;

import java.util.List;


public class PlaceListFragment2 extends Fragment {

    LocationManager locationManager;
    RecyclerView rv;
    List<String> arr;
    Utils utils;
    Double longitude;
    Double latitude;

   public RecyclerViewNearbyPlacesAdapter MyAdapter;
    ProgressDialog progressDialog;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rv = (RecyclerView) inflater.inflate(
                R.layout.fragment_nearby_places_list, container, false);

        locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);


        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
        }


        RecyclerViewNearbyPlacesAdapter adapter = new RecyclerViewNearbyPlacesAdapter(getActivity());
        MyAdapter = adapter;
        try {
            MyAdapter.add(utils.getSelectPlaces());
        }catch (Exception e){
            Log.v("fff","пусто тут");
        }
        MyAdapter.notifyDataSetChanged();
        rv.setAdapter(MyAdapter);


        return rv;
    }





}