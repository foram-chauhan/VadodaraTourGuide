package com.example.dell.vadodaratourguide;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DELL on 28-12-2016.
 */

public class TourAdapter extends ArrayAdapter<Tour> {
    public TourAdapter(Activity context, ArrayList<Tour> tours) {
        super(context, 0, tours);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //Get {@link Tour} object located at the position in the list
        Tour currentTour = getItem(position);
        //Find the TextView in the list_tem.xml with the ID title_text_view
        TextView titleTextView = (TextView)listItemView.findViewById(R.id.title_text_view);
        //Get the title from the currentTour object and set this text on the TextView
        titleTextView.setText(currentTour.getTitle());

        //Find the TextView in the list_tem.xml with the ID description_text_view
        TextView descriptionTextView = (TextView)listItemView.findViewById(R.id.description_text_view);
        //Get the title from the currentTour object and set this text on the TextView
        descriptionTextView.setText(currentTour.getDescription());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentTour.getImageResourceId());
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
