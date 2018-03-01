package com.example.dell.vadodaratourguide;

/**
 * Created by DELL on 28-12-2016.
 */

public class Tour {
    private String tTitle;
    private String tDescription;
    private int tImageResourceId;

    public Tour(String title,String description,int imageResourceId){
        tTitle = title;
        tDescription = description;
        tImageResourceId = imageResourceId;
    }

    public String getDescription() {
        return tDescription;
    }

    public String getTitle() {
        return tTitle;
    }

    public int getImageResourceId() {
        return tImageResourceId;
    }
}
