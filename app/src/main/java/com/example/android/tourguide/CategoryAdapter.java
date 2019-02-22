package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelsFragment();
        } else if (position == 1) {
            return new PicnicFragment();
        } else if (position == 2) {
            return new HeritageFragment();
        } else if (position == 3) {
            return new ShoppingFragment();
        } else if (position == 4) {
            return new EatFragment();
        } else {
            return new HospitalsFragment();
        }
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_hotels);
        } else if (position == 1) {
            return mContext.getString(R.string.category_picnic);
        } else if (position == 2) {
            return mContext.getString(R.string.category_heritage);
        } else if (position == 3) {
            return mContext.getString(R.string.category_shopping);
        } else if (position == 4) {
            return mContext.getString(R.string.category_eat);
        } else {
            return mContext.getString(R.string.category_hospitals);
        }
    }
}
