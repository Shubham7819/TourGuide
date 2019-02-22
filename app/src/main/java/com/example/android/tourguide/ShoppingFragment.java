package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.c21), 4.3f,
                getString(R.string.c21_address),
                getString(R.string.c21_contact), getString(R.string.c21_web),
                getString(R.string.c21_details),
                R.drawable.c21_mall));
        places.add(new Place(getString(R.string.ti_mall), 4.3f,
                getString(R.string.ti_mall_address),
                getString(R.string.ti_mall_contact), getString(R.string.ti_mall_web),
                getString(R.string.ti_mall_details),
                R.drawable.treasure_island_mall));
        places.add(new Place(getString(R.string.central), 3.9f,
                getString(R.string.central_address),
                getString(R.string.central_contact), getString(R.string.central_web),
                "", R.drawable.indore_central));
        places.add(new Place(getString(R.string.malhar), 4.1f,
                getString(R.string.malhar_address),
                "", "",
                getString(R.string.malhar_details),
                R.drawable.malhar_mega_mall));
        places.add(new Place(getString(R.string.silver_mall), 3.7f,
                getString(R.string.silver_mall_address),
                "", "",
                getString(R.string.silver_mall_details),
                R.drawable.silver_mall));
        places.add(new Place(getString(R.string.pakiza), 3.7f,
                getString(R.string.pakiza_address),
                getString(R.string.pakiza_contact), getString(R.string.pakiza_web),
                getString(R.string.pakiza_details),
                R.drawable.pakiza));
        places.add(new Place(getString(R.string.mangal_city), 3.7f,
                getString(R.string.mangal_city_address),
                getString(R.string.mangal_city_contact), "",
                getString(R.string.mangal_city_details),
                R.drawable.mangal_city_mall));
        places.add(new Place(getString(R.string.lotus_electronics), 3.9f,
                getString(R.string.lotus_address),
                getString(R.string.lotus_contact), getString(R.string.lotus_web),
                getString(R.string.lotus_details),
                R.drawable.lotus_electronics));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
