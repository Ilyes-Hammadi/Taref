package com.cortexia.taref.adapter;

/**
 * Created by ilyes on 21/09/15.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.cortexia.taref.R;
import com.cortexia.taref.data.ItemsData;
import com.cortexia.taref.data.JsonHelper;
import com.cortexia.taref.fragment.RecycleItemsFragment;
import com.github.saiff35.livingtabs.LivingTabsLayout;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionAdapter extends FragmentPagerAdapter implements LivingTabsLayout.DrawableResIconAdapter {

    public SectionAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        JsonHelper jsonHelper = new JsonHelper();

        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

        switch (position) {

            case 0:
                return new RecycleItemsFragment(ItemsData.getAnimals());
            case 1:
                return new RecycleItemsFragment();
            case 2:
                return new RecycleItemsFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Animeaux";
            case 1:
                return "Planets";
            case 2:
                return "Plantes";
        }


        return null;
    }

    @Override
    public int getIcon(int position) {


        switch (position) {
            case 0:
                return R.drawable.ic_cat_white_36dp;
            case 1:
                return R.drawable.ic_brightness_1_white_36dp;
            case 2:
                return R.drawable.ic_pine_tree_white_36dp;
        }
        return -1;
    }


}
