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
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list,container,false);
        ArrayList<Tour> tours =new ArrayList<Tour>();
        tours.add(new Tour("Navratri","Festival of Goddess Amba, World famlus Navratri of United way Of Baroda.",R.drawable.durga));
        tours.add(new Tour("Ganpati Mahotsav","10 Day Festival of God Shree Ganesha",R.drawable.ganpati));
        tours.add(new Tour("Uttarayan","Also called Makar Sankranti, Kite Festival on 14th and 15th January. ",R.drawable.kite));
        tours.add(new Tour("Diwali","Biggest festival of Hindus. Festval of God Rama.",R.drawable.diwali));

        //Create {@link TourAdapter}, whose datasource is a list of {@link Tour}s. The adapter knows how to create
        //list item views for each item in the list

        TourAdapter tourAdapter = new TourAdapter(getActivity(),tours);

        //Get a reference to the listview and attach the adapter to the listview
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(tourAdapter);
        return rootView;
    }

}
