package com.example.dell.vadodaratourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list,container,false);
        ArrayList<Tour> tours =new ArrayList<Tour>();
        tours.add(new Tour("Mahakali Sevsal","Famous dish of Vadodara",R.drawable.sevsad));
        tours.add(new Tour("Tasty Vadapav","Mumbai like vadapav in Vadodara",R.drawable.vadapav));
        tours.add(new Tour("Bhakharvadi","Jagdish's bhakharvadi of Vadodara is famous since 1945",R.drawable.bhakharvadi));
        tours.add(new Tour("Bhajiya","Manmohan's famous Bhajiya Centre is a delightful experience indeed.",R.drawable.pakora));

        //Create {@link TourAdapter}, whose datasource is a list of {@link Tour}s. The adapter knows how to create
        //list item views for each item in the list

        TourAdapter tourAdapter = new TourAdapter(getActivity(),tours);

        //Get a reference to the listview and attach the adapter to the listview
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(tourAdapter);
        return rootView;
    }

}
