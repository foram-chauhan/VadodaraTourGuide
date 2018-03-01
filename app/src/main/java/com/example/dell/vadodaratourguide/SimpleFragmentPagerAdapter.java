package com.example.dell.vadodaratourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DELL on 24-12-2016.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] tabTitles = new String[]{"Attractions","Restaurants","Events","Phrases"};
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new AttractionsFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        }else{
            return new EventsFragment();
        }
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 3;
    }
}
