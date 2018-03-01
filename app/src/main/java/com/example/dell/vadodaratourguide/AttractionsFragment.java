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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.tour_list, container,false);

        ArrayList<Tour> tours =new ArrayList<Tour>();
        tours.add(new Tour("Laxmi Vilas Palace","It is an oldest Palace",R.drawable.lvp));
        tours.add(new Tour("MSU","Maharaja Sayajirao University is the world renowned university of Vadodara",R.drawable.msu));
        tours.add(new Tour("Sayaji Garden","One of the attraction of Vadodara",R.drawable.sayajigarden));
        tours.add(new Tour("Sursagar","Lake in the centre of the City.",R.drawable.images));

        //Create {@link TourAdapter}, whose datasource is a list of {@link Tour}s. The adapter knows how to create
        //list item views for each item in the list

        TourAdapter tourAdapter = new TourAdapter(getActivity(),tours);

        //Get a reference to the listview and attach the adapter to the listview
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(tourAdapter);
        return rootView;
    }

}
